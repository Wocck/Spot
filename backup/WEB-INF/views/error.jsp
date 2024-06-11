<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Błąd</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f0f0f0;
            color: #333;
        }
        .container {
            background: white;
            max-width: 600px;
            margin: auto;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        h1 {
            color: #d32f2f;
        }
        p {
            line-height: 1.6;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Wystąpił błąd!</h1>
    <% if (request.getAttribute("errorCode") != null) { %>
    <h2>Kod błędu: <%= request.getAttribute("errorCode") %></h2>
    <% } %>
    <% if (request.getAttribute("errorMessage") != null) { %>
    <p><%= request.getAttribute("errorMessage") %></p>
    <% } %>
    <p>Przepraszamy za problem.</p>
</div>
</body>
</html>
