package bdeb.etu.schoolapp.view;

import bdeb.etu.schoolapp.dl.EtudiantDAO;
import bdeb.etu.schoolapp.dl.IEtudiantDAO;
import bdeb.etu.schoolapp.model.Etudiant;
import bdeb.etu.schoolapp.service.EtudiantService;

import java.sql.Driver;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Démarrage de l'application...");
//        lancer le teste
        test1();
        test2();
        System.out.println("Test terminé avec succès!");
    }

    private static void test2() {
        IEtudiantDAO dao;
        dao = new EtudiantDAO();
        EtudiantService service = new EtudiantService(dao);
        Etudiant etudiant = new Etudiant("flou", "flouflou", "info");
        service.ajouterEtudiant(etudiant);
        System.out.println("etuuuudiant: " + etudiant);
    }

    private static void test1() {
        IEtudiantDAO dao;
        dao = new EtudiantDAO();
        EtudiantService service = new EtudiantService(dao);

        List<Etudiant> etudiants = service.recupererEtudiants();

        // Affichage des étudiants

        System.out.println("\nListe des étudiants:");
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant trouvé.");
        } else {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }
    }

}