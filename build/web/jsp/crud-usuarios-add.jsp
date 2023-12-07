<%-- 
    Document   : crud-usuarios-edit
    Created on : 16 nov 2023, 19:06:32
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuarios</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }

            center {
                margin-top: 50px;
            }

            h3 {
                color: #333;
            }

            hr {
                border: 1px solid #ddd;
                margin-top: 10px;
            }

            form {
                max-width: 400px;
                margin: 20px auto;
                padding: 20px;
                background-color: white;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                border-radius: 5px;
            }

            input {
                width: 100%;
                padding: 10px;
                margin: 5px 0;
                box-sizing: border-box;
            }

            input[type="submit"] {
                background-color: #333;
                color: white;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <center>
            <div>
                <h3>Agregar Usuarios</h3>
            </div>
            <div>
                <form action="/Siic/HomeController" method="POST">
                    ID_USUARIOS:<br>
                    <input type="number" name="ID_USUARIO" value="${usuario.getId_usuario()}"><br>
                    CONTRASEÑA:<br>
                    <input type="txt" name="txtccusuario" value="${usuario.getContrasenia()}"><br>
                    US_NOMBRE:<br>
                    <input type="txt" name="txtusnombre" value="${usuario.getCc_nombre()}"><br>
                    US_APELLIDO:<br>
                    <input type = "txt" name="txtusapellido" value="${usuario.getCc_apellido()}"><br>
                    US_SEGAPELLIDO:<br>
                    <input type="txt" name="txtussegapellido" value="${usuario.getCc_segApellido()}"><br>
                    CORREO:<br>
                    <input type="email" name="txtcorreo" value="${usuario.getCorreo()}"><br>
                    CODIGO_PERFIL:<br>
                    <input type="number" name="CODIGO_PERFIL" value="${usuario.getCodigo_perfil()}"><br>
                    <br>
                    <input type = "submit" name="accion" value="Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
