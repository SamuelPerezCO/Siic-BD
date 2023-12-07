<%-- 
    Document   : inicio
    Created on : 5 nov 2023, 12:05:18
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SIIC - Repository</title>
    <link rel="stylesheet" href="../css/inicio.css">
    <link rel="icon" type="image/png" href="../img/img-Poli3.png">
    <!-- Hacer lo del ico para que la imagen de la ventana sea diferente -->
</head>
<body>
    <header>
        <div class="container">
            <div class="header-content">
                <img src="../img/img-Poli2.png" alt="escudo politecnico" class="logo-img">
                <p class="logo-text">SIIC - Repository</p>
            </div>
            <nav>
                <a href="#somos-SIIC">Quienes Somos</a>
                <a href="#nuestras-Contenido">Nuestro Contenido</a>
                <a href="/Siic/jsp/index.jsp">Desconectar</a>
            </nav>
        </div>
    </header>

    <!-- Primera seccion -->
    <section id="hero">
        <h1>Semillero de Investigacion en Inteligencia Computacional - SIIC</h1>
    </section>
    <!-- Segunda Seccion -->
    <section id="somos-SIIC">
        <div class="container">
            <div class="texto">

                <div class="img-container"></div>
                <h2>Somos <span class="color-acento">SIIC</span></h2>
                <p> El Semillero de Investigación en Inteligencia Computacional – SIIC, pertenece a la Línea Potencial de Sistemas, Informática y Telecomunicaciones - Nudo Problémico  en Inteligencia Computacional y al Grupo de Investigación en Ingeniería Sostenible - (GIS)  de la Facultad de Ingeniería del Politécnico Colombiano Jaime Isaza Cadavid. </p>
            </div>
        </div>
    </section>
    <!-- Tercera Seccion -->
    <section id="nuestras-Contenido">
        <div class="container">
            <h2>Nuestro Contenido</h2>
                <div class="Contenido">
                    <div class="carta">
                        <h3>Sesiones</h3>
                        <p>Aca podras encontrar todas las grabaciones de las clases para repasar tu estudio</p>
                        <!-- Para que funcione el boton hay en anidarlo en un FORM -->
                        <button><a href="sesiones.jsp">+ info </a></button>
                    </div>
                    <div class="carta">
                        <h3>Presentaciones</h3>
                        <p>Aca encontraras todas las presentaciones vistas en el semillero</p>
                        <!-- Para que funcione el boton hay en anidarlo en un FORM -->
                        <button><a href="presentaciones.jsp">+ info</a></button>
                    </div>
                    <div class="carta">
                        <h3>Tutoriales En Colab</h3>
                        <p>Aca encontraras todos los codigos desarrollados en clase en la plataforma Colab</p>
                        <!-- Para que funcione el boton hay en anidarlo en un FORM -->
                        <button><a href="t-colab.jsp">+ info</a></button>
                    </div>
                </div>
                
        </div>
    </section>
    <!-- Cuarta Seccion -->
    <section id="caracteristicas">
        <div class="container">
            <ul>
                <li>✔️ Encontraras todos las <br> grabaciones de las clases en este sitio web</li>
                <li>✔️ Encontraras todas las <br> presentaciones en este sitio web</li>
                <li>✔️ Encontraras todos los <br> tutoriales hechos en colab en este sitio web</li>
                <li>✔️ Los profesores podran <br> manejar la asistencia desde este sitio web <br> y muchas mas cosas</li>
            </ul>
        </div>
    </section>
    <hr>
    <!-- Quinta Seccion -->
    <section id="final">
        <p>Link para Sesiones los  días martes 12 m:  <a href="meet.google.com/rhx-pevy-ddf">meet.google.com/rhx-pevy-ddf</a><br>
            <br>
            Contacto:<br>
            Jorge Ernesto Espinosa Oviedo<br>
            jeespinosa@elpoli.edu.co<br> 
            <br>
            PhD. Msc. Computer Engineer<br>
            <br>
            Docente Investigador<br>
            <br>
            Politécnico Colombiano Jaime Isaza Cadavid<br>
            <br>
            Tel. 57 (4) 319 79 00 ext 492<br>
            <br>
            Oficina P19-211 G</p>
    </section>

    <footer>
        <div class="container">
            <p>&copy; SIIC 2023</p>
        </div>
    </footer>
</body>
</html>
