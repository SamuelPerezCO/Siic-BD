<%-- 
    Document   : sesiones
    Created on : 5 nov 2023, 12:19:21
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/sesiones.css">
    <link rel="icon" type="image/png" href="../img/img-Poli3.png">

    <title>Sesiones</title>
</head>
<body>
    <header>
        <div class="container">
            <div class="header-content">
                <img src="../img/img-Poli.png" alt="escudo politecnico" class="logo-img">
                <p class="logo-text">SIIC - Repository</p>
            </div>
            <div>
                <p class = "logo-info">Sesiones</p>
            </div>
            <nav>
                <a href="inicio.jsp">Inicio</a>
                <a href="presentaciones.jsp">Presentaciones</a>
                <a href="t-colab.jsp">Tutoriales en colab</a>
                <a href="index.jsp">Desconectar</a>
            </nav>
        </div>
    </header>
    <div class="sesiones">
        <br>
        <h1 id="title">Sesiones</h1>
        <p id="text">Sesion 1 - (2023-2) - agosto 15 de 2023</p>
        <iframe id="video" src="https://drive.google.com/file/d/1Mar62uoLDotqZLa8gTUhhvtKjlTRNTqD/preview" allow="autoplay"></iframe>
        <hr>
        <p id="text">Sesión  2 -( 2023-2) -  agosto 29 de 2023</p>
        <iframe id="video"src="https://drive.google.com/file/d/1bbbBIbBGvL-dsW8uZen-k9siRXxNfkMh/preview" allow="autoplay"></iframe>
        <hr>
        <p id="text">Sesión  3 -( 2023-2) -  septiembre 12  de 2023</p>
        <iframe id="video" src="https://drive.google.com/file/d/1PesC_3OfpUfzDsrLOfnVnvwTf3ykN0RD/preview" allow="autoplay"></iframe>
        <hr>
        <p id="text">Sesión  4 -( 2023-2) -  septiembre 26  de 2023</p>
        <iframe id ="video" src="https://drive.google.com/file/d/1NP821iNc7aCCJag6hdjZh6aJe5IrvbYu/preview"  allow="autoplay"></iframe>
        <hr>
        <p id="text">Sesión  5 -( 2023-2) -  octubre 10  de 2023</p>
        <iframe id="video" src="https://drive.google.com/file/d/16o3Fs_KF_OGe8ti8UlN8CjV9siH85-No/preview"  allow="autoplay"></iframe>
        <hr>
    </div>
</body>
</html>
