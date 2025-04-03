package bdeb.etu.schoolapp.dl;

import bdeb.etu.schoolapp.model.Etudiant;

import java.util.List;

public interface IEtudiantDAO {
    List<Etudiant> recupererToutEtudiants();
    Etudiant ajouterEtudiant(Etudiant etudiant);
}
