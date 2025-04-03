package bdeb.etu.schoolapp.dl;

import bdeb.etu.schoolapp.model.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO {
    private final EntityManagerFactory emf;

    public EtudiantDAO() {
        this.emf = Persistence.createEntityManagerFactory("PersistenceUnitInfo");
    }

    @Override
    public List<Etudiant> recupererToutEtudiants() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Etudiant> query = em.createQuery("SELECT e FROM Etudiant e", Etudiant.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(etudiant);
            em.getTransaction().commit();
            return etudiant;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erreur lors de l'ajout de l'étudiant", e);
        } finally {
            em.close();
        }
    }

    // Méthode pour fermer l'EntityManagerFactory quand on n'en a plus besoin
    public void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}