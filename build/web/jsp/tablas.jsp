<%-- 
    Document   : tablas
    Created on : 5 nov 2023, 12:50:44
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SIIC - Repository</title>
    <link rel="stylesheet" href="../css/tablas.css">
    <link rel="icon" type="image/png" href="../img/img-Poli3.png">
    <style>
        *{
            box-sizing: border-box;
        }

        html{
            scroll-behavior: smooth;
        }
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            margin-top: 0; /* Añade esta línea para eliminar el margen superior */
        }

        .navbar {
            display: flex;
            flex-direction: row;
            justify-content: flex-end; 
            text-align: center;
            padding-bottom: 15px;
            background-color: #000;
            margin-left: 660px;
            margin-top: -30px;
        }

        .navbar a {
            padding: 0px 10px; /* Ajusta el espaciado según tus necesidades */
            text-decoration: none;
            font-weight: bold;
            color: white;
        }

        /*header {
            background-color: #000;
            padding: 10px 10px 0px 10px;
            text-align: center;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin:0;
        }*/

        header{
            background-color: #0C0909;
        }

        .header-content {
            display: flex;
            align-items: center;
        }

        header .logo{
            margin:0;
            padding: 25px 30px ;
            font-weight: bold;
            color:white;
            font-size: 1.6em;
        }

        header .container{
            display:flex;
            flex-direction: column;
            align-items: center;

        }

        header nav{
            display:flex;
            flex-direction: column;
            text-align: center;
            padding-bottom: 25px;
        }

        header a{
            padding: 5px 12px;
            text-decoration: none;
            font-weight: bold;
            color:white;
        }

        .logo-img {
            max-width: 100px;
            height: auto;
            margin-right: 10px;
            padding:0px;
        }

        .header-content {
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin-right: 850px;
            margin-bottom: 0px;
            margin-top: 10px
        }
        .logo-text {
            font-weight: bold;
            color: white;
            font-size: 1.6em;
            margin: 0;
        }

        nav {
            display: flex;
            flex-direction: row;
            justify-content: flex-end; 
            text-align: center;
            background-color: #000;
        }

        nav a {
            padding: 0px 0px 0px 10px;
            text-decoration: none;
            font-weight: bold;
            color: white;
        }

        nav a:hover {
            color: gray;
        }

        header nav{
            display:flex;
            flex-direction: column;
            text-align: center;
            padding-bottom: 25px;
        }

        main {
            max-width: 1200px;
            margin: 80px auto 20px;
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
            gap: 30px;
            padding: 0 20px;
        }

        .thumbnail {
            position: relative;
            overflow: hidden;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            cursor: pointer;
            transition: transform 0.2s;
        }

        .thumbnail img {
            width: 100%;
            height: auto;
        }

        .thumbnail:hover {
            transform: scale(1.05);
        }

        .title {
            margin-top: 10px;
            font-size: 14px;
            color: #333;
        }

        .container {
            max-width: 1400px;
            margin: auto;
        }

        .header-content {
            display: flex;
            align-items: center;
        }

    </style>
</head>
    <body>

    <header>
        <div class="container">
            <div class="header-content">
                <img src="/Siic/img/img-Poli2.png" alt="escudo politecnico" class="logo-img">
                <p class="logo-text">SIIC - Repository</p>
            </div>
            <nav class="navbar">
                <a href="/Siic/jsp/tablas.jsp">Ingresar a tablas</a>
                <a href="/Siic/jsp/inicio.jsp">Ver el contenido</a>
                <a href="/Siic/jsp/index.jsp">Desconectar</a>
            </nav>
        </div>
    </header>

        <main>
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-presentaciones.jsp"><img src="/Siic/img/presentaciones-profesor.jpg" alt="presentaciones"></a>
                <div class="title">Presentaciones</div>
            </div>

            <div class="thumbnail">
                <a href="/Siic/jsp/crud-clases.jsp"><img src="/Siic/img/sesiones-profesor.webp" alt="Sesiones"></a>
                <div class="title">Clases</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-usuarios.jsp"><img src="/Siic/img/User_icon_2.svg.png" alt="Usuarios"></a>
                <div class="title">Usuarios</div>
            </div>
                    
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-asistencia.jsp" ><img src="/Siic/img/asistencia.png" alt="Asistencia"></a>
                <div class="title">Asistencia</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-permisos.jsp"><img src="/Siic/img/permisos.png" alt="Permisos"></a>
                <div class="title">Permisos</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-roles.jsp"><img src="/Siic/img/Roles-dentro-de-un-equipo-de-trabajo.webp" alt="presentaciones"></a>
                <div class="title">Roles</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-precla.jsp"><img src="/Siic/img/20190725-LB0070-05-1024x576.jpg" alt="Presentaciones en clase"></a>
                <div class="title">Presentaciones clases</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/crud-perfiles.jsp"><img src="/Siic/img/retratos-personas-perfil-avatares-perfiles-faciales-masculinos-femeninos-retrato-lateral-cabezas-persona-usuario-web-avatar-retrato-personaje-.webp" alt="Perfiles"></a>
                <div class="title">Perfiles</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/tabla_vistaUC.jsp"><img src="/Siic/img/descargar.png" alt="Vista de usuarios en clase"></a>
                <div class="title">Vista de usuarios en clases</div>
            </div>
            
            <div class="thumbnail">
                <a href="/Siic/jsp/tabla_vistaPC.jsp"><img src="/Siic/img/infografia-y-presentacion.webp" alt="Vista de presentaciones usadas en clase"></a>
                <div class="title">Vista de presentaciones usadas en clases</div>
            </div>
        </main>
    </body>
</html>
