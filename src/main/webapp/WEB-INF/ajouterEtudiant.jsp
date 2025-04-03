<%--
  Created by IntelliJ IDEA.
  User: benka
  Date: 4/2/2025
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un Étudiant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css">
    <style>
        .form-container {
            max-width: 600px;
            margin: 30px auto;
            padding: 30px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        .form-title {
            color: #0d6efd;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="form-container">
        <h1 class="form-title text-center">
            <i class="bi bi-person-plus"></i> Ajouter un nouvel étudiant
        </h1>

        <form action="${pageContext.request.contextPath}/AjouterEtudiant" method="post">


            <div class="mb-3">
                <label for="nom" class="form-label">Nom:</label>
                <input type="text" class="form-control" id="nom" name="nom" required>
            </div>

            <div class="mb-3">
                <label for="prenom" class="form-label">Prénom:</label>
                <input type="text" class="form-control" id="prenom" name="prenom" required>
            </div>

            <div class="mb-3">
                <label for="specialite" class="form-label">Spécialité:</label>
                <input type="text" class="form-control" id="specialite" name="specialite" required>
            </div>

            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                <a href="${pageContext.request.contextPath}/liste-etudiants" class="btn btn-secondary me-md-2">
                    <i class="bi bi-arrow-left"></i> Retour
                </a>
                <button type="submit" class="btn btn-primary">
                    <i class="bi bi-check-circle"></i> Enregistrer
                </button>
            </div>
        </form>
        <!-- Lien pour retourner à l'index -->
        <div class="back-link">
            <a href="index.jsp" class="btn btn-primary">
                <i class="bi bi-arrow-left"></i> Retour à l'accueil
            </a>
        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
