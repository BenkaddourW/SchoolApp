package bdeb.etu.schoolapp.controler;

import bdeb.etu.schoolapp.dl.EtudiantDAO;
import bdeb.etu.schoolapp.model.Etudiant;
import bdeb.etu.schoolapp.service.EtudiantService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/AjouterEtudiant")
public class AjouterEtudiantServlet extends HttpServlet {
    private EtudiantService etudiantService;

    @Override
    public void init() {
        this.etudiantService = new EtudiantService(new EtudiantDAO());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Afficher le formulaire
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ajouterEtudiant.jsp");
        dispatcher.forward(request, response);
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Récupérer les paramètres du formulaire (sans l'ID)
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String specialite = request.getParameter("specialite");

            // Créer un nouvel étudiant sans spécifier l'ID
            Etudiant nouvelEtudiant = new Etudiant();
            nouvelEtudiant.setNom(nom);
            nouvelEtudiant.setPrenom(prenom);
            nouvelEtudiant.setSpecialite(specialite);

            // Ajouter l'étudiant
            etudiantService.ajouterEtudiant(nouvelEtudiant);

            // Rediriger vers la liste des étudiants
            response.sendRedirect(request.getContextPath() + "/liste-etudiants");
        } catch (Exception e) {
            // En cas d'erreur, retourner au formulaire avec un message d'erreur
            request.setAttribute("erreur", "Une erreur est survenue: " + e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ajouterEtudiant.jsp");
            dispatcher.forward(request, response);
        }
    }
}