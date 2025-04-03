-- creation de la table etudiant
CREATE TABLE Etudiant (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          nom VARCHAR(50) NOT NULL,
                          prenom VARCHAR(50) NOT NULL,
                          specialite VARCHAR(100) NOT NULL
)


-- Insertion de 5 enregistrements

INSERT INTO Etudiant (nom, prenom, specialite) VALUES
('Tremblay', 'Jean', 'Informatique'),
('Gagnon', 'Marie', 'Génie électrique'),
('Roy', 'Pierre', 'Administration'),
('Côté', 'Sophie', 'Médecine'),
('Bouchard', 'Luc', 'Psychologie');