<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css">
    <style>
        body {
            padding: 20px;
            background-color: #f8f9fa;
        }
        .welcome-container {
            max-width: 800px;
            margin: 0 auto;
            padding: 30px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        .welcome-title {
            color: #0d6efd;
            margin-bottom: 30px;
        }
        .btn-custom {
            margin: 5px;
            padding: 10px 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="welcome-container text-center mt-5">
        <h1 class="welcome-title display-4">
            <i class="bi bi-globe"></i> <%= "Hello World!" %>
        </h1>

        <h2 class="mb-4">
            <i class="bi bi-house-door"></i> Bienvenue à l'école
        </h2>

        <div class="d-flex justify-content-center flex-wrap">
            <a href="${pageContext.request.contextPath}/liste-etudiants"
               class="btn btn-primary btn-custom">
                <i class="bi bi-people-fill"></i> Voir la liste des étudiants
            </a>

            <a href="${pageContext.request.contextPath}/AjouterEtudiant"
               class="btn btn-success btn-custom">
                <i class="bi bi-chat-left-text"></i> Ajouter un nouveau etudiant
            </a>
        </div>
    </div>
</div>

<!-- Bootstrap JS Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>