<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome to Spot</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }
        .bg {
            /* The image used */
            background-image: url("https://source.unsplash.com/random/1920x1080?music");

            /* Full height */
            height: 100%;

            /* Center and scale the image nicely */
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .container {
            height: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-button {
            background-color: #1DB954; /* Spotify color */
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 50px;
        }
    </style>
</head>
<body>
<div class="bg">
    <div class="container">
        <a href="${pageContext.request.contextPath}/oauth2/authorization/spotify" class="login-button">Log in with Spotify</a>
    </div>
</div>
</body>
</html>
