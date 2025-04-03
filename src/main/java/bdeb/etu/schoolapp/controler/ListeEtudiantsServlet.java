package bdeb.etu.schoolapp.controler;

import bdeb.etu.schoolapp.dl.EtudiantDAO;
import bdeb.etu.schoolapp.model.Etudiant;
import bdeb.etu.schoolapp.service.EtudiantService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

//@WebServlet(name = "ListeEtudiantsServlet", urlPatterns = "/liste-etudiants")
@WebServlet("/liste-etudiants")  // Version simplifiée
public class ListeEtudiantsServlet extends HttpServlet {
    private EtudiantService etudiantService;

    @Override
    public void init() {

        this.etudiantService = new EtudiantService(new EtudiantDAO());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer la liste des étudiants
        List<Etudiant> etudiants = etudiantService.recupererEtudiants();

        // Ajouter la liste à la requête pour la JSP
        request.setAttribute("etudiants", etudiants);
        System.out.println("Nombre d'étudiants récupérés: " + etudiants.size());
        // Rediriger vers la JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/listeEtudiants.jsp");
        dispatcher.forward(request, response);
    }
}