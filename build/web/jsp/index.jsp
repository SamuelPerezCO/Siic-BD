<%-- 
    Document   : index
    Created on : 5 nov 2023, 11:47:38
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link rel="stylesheet" href="/Siic/css/login.css" />
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="icon" type="image/png" href="../img/img-Poli3.png">
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <title>LOGIN - SIIC</title>
    </head>

    <body>
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="/Siic/HomeController" method="POST" class="sign-in-form">
                        <h2 class="title">Entrar</h2>
                        <span>${msg}</span>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input name="username" type="text" placeholder="Usuario" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input name="password" type="password" placeholder="Contraseña" />
                        </div>
                        <input name="accion" type="submit" value="Iniciar Sesion" class="btn solid"/>
                        <p class="social-text">O ingresa con alguna de estas plataformas</p>
                        <div class="social-media">
                            <a href="#" class="social-icon">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </div>
                    </form>
                    <form action="/Siic/HomeController" method="POST" class="sign-up-form">
                        <h2 class="title">Crear Cuenta</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input name="usernameR" type="text" placeholder="Usuario" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input name="email" type="email" placeholder="Email" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input name="passwordR" type="password" placeholder="Contraseña" />
                        </div>
                        <input name="accion" type="submit" class="btn" value="Registrarse" />
                        <p class="social-text">O Crea la cuenta con alguna de estas plataformas</p>
                        <div class="social-media">
                            <a href="#" class="social-icon">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </div>
                    </form>
                </div>
            </div>

            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>Nuevo aqui ?</h3>
                        <p>
                            "¿Quieres tener acceso exclusivo a nuestro mundo de conocimiento? Regístrate en SIIC y comienza a explorar un universo de aprendizaje sin límites."
                        </p>
                        <button class="btn transparent" id="sign-up-btn">
                            Crear cuenta
                        </button>
                    </div>
                    <img  src="https://i.ibb.co/6HXL6q1/Privacy-policy-rafiki.png" class="image" alt="" />
                </div>
                <div class="panel right-panel">
                    <div class="content">
                        <h3>uno de nosotros?</h3>
                        <p>
                            "Prepárate para aprender sin límites. Únete a SIIC y accede a una plataforma que expandirá tus horizontes."
                        </p>
                        <button class="btn transparent" id="sign-in-btn">
                            Ingresar
                        </button>
                    </div>
                    <img src="https://i.ibb.co/nP8H853/Mobile-login-rafiki.png"  class="image" alt="" />
                </div>
            </div>
        </div>

        <script src="/Siic/js/login.js"></script>
    </body>

</html>
