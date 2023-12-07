<%-- 
    Document   : presentaciones
    Created on : 5 nov 2023, 12:18:57
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/presentaciones.css">
    <link rel="icon" type="image/png" href="../img/img-Poli3.png">

    <title>Presentaciones</title>
</head>
<body>
    <header>
        <div class="container">
            <div class="header-content">
                <img src="../img/img-Poli.png" alt="escudo politecnico" class="logo-img">
                <p class="logo-text">SIIC - Repository</p>
            </div>
            <div>
                <p class = "logo-info">Presentaciones</p>
            </div>
            <nav>
                <a href="inicio.jsp">Pagina de Bienvenida</a>
                <a href="sesiones.jsp">Sesiones</a>
                <a href="t-colab.jsp">Tutoriales en colab</a>
                <a href="index.jsp">Login</a>
            </nav>
        </div>
    </header>
        <div class="presentaciones">
            <br>
            <h1 id="titulo">Presentaciones</h1>
            <p id="text">  Martes  15 de agosto  - 2023  - Presentación del Semillero para 2023-  2  - Sesión 1 </p>
            <embed id="p" src="../pdf/presentacionSemillero2023-2.pdf#toolbar=0&navpanes=0&scrollbar=1" type="application/pdf" width="70%" height="600px" />
            <hr>
            <p id="text">Martes  29 de agosto  - 2023  - Avances de proyectos - Sesión  2 </p>
            <embed id="p" src="../pdf/session2.pdf#toolbar=0&navpanes=0#scrollbar=1" type="application/pdf" width="70%" height="600px">
            <hr>
            <p id="text">  Martes  12 de septiembre - 2023  - Avances de proyectos - Sesión  3 </p>
            <embed id="p" src="../pdf/session3.pdf#toolbar=0&navpanes=0#scrollbar=1" type="application/pdf" width="70%" height="600px">
            <hr>
            <p id="text">  Martes  26 de septiembre - 2023  - Avances de proyectos - Sesión 4 </p>
            <embed id="p" src="../pdf/session4.pdf#toolbar=0&navpanes=0#scrollbar=1" type="application/pdf" width="70%" height="600px">
            <hr>
            <p id="text">Martes  10 de octubre - 2023  - Avances de proyectos - Sesión  5 </p>
            <embed id="p" src="../pdf/session5.pdf#toolbar=0&navpanes=0#scrollbar=1" type="application/pdf" width="70%" height="600px">
        </div>
</body>
</html>