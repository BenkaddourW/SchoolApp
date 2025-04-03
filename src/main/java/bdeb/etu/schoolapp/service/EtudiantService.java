package bdeb.etu.schoolapp.service;

import bdeb.etu.schoolapp.dl.IEtudiantDAO;
import bdeb.etu.schoolapp.model.Etudiant;

import java.util.List;

public class EtudiantService {

    IEtudiantDAO dao;

    public EtudiantService(IEtudiantDAO dao) {
        this.dao = dao;
    }

    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return dao.ajouterEtudiant(etudiant);
    }

    public List<Etudiant> recupererEtudiants() {
        return dao.recupererToutEtudiants();
    }
}
