<%--
  Created by IntelliJ IDEA.
  User: benka
  Date: 4/2/2025
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Liste des Étudiants</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Optional Bootstrap Icons -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css">
  <style>
    body {
      padding: 20px;
    }
    .table-container {
      margin-top: 20px;
    }
    h1 {
      margin-bottom: 20px;
      color: #0d6efd;
    }
  </style>
</head>
<body>
<div class="container">
  <h1 class="text-center">Liste des Étudiants</h1>

  <div class="table-container">
    <table class="table table-striped table-hover table-bordered">
      <thead class="table-dark">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nom</th>
        <th scope="col">Prénom</th>
        <th scope="col">Spécialité</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${etudiants}" var="etudiant">
        <tr>
          <td>${etudiant.id}</td>
          <td>${etudiant.nom}</td>
          <td>${etudiant.prenom}</td>
          <td>${etudiant.specialite}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
  <!-- Lien pour retourner à l'index -->
  <div class="back-link">
    <a href="index.jsp" class="btn btn-primary">
      <i class="bi bi-arrow-left"></i> Retour à l'accueil
    </a>
  </div>
</div>

<!-- Bootstrap JS Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>