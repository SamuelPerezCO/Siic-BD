<%-- 
    Document   : crud-perfiles-add
    Created on : 27/11/2023, 8:57:16 a. m.
    Author     : Juan Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfiles Agregar</title>
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
            <h1>
                AGREGAR PERFILES
            </h1>
            <hr>
        </div>
        <div>
            <form action="/Siic/ControladorPerfiles" method="POST">
                ID:<br>
                <input type="text" name="txtid_perfil"> <br>
                DESCRIPCION:<br>
                <input type="text" name="txtdescripcion_perfil"> <br>
                ROL:<br>
                <input type="text" name="txtcodigo_rol"> <br>
                PERMISO:<br>
                <input type="text" name="txtcodigo_permiso"> <br>
                <input type="submit" name="accion" value="Guardar"> <br>
            </form>
        </div>
    </center>
    </body>
</html>