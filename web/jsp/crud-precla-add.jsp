<%-- 
    Document   : addPreCla
    Created on : 23/11/2023, 9:58:40 a. m.
    Author     : Juan Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PreCla Agregar</title>
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
                AGREGAR PRESENTACIONES EN CLASE
            </h1>
            <hr>
        </div>
        <div>
            <form action="ControladorPreCla" method="POST">
                ID:<br>
                <input type="text" name="txtid_pc"> <br>
                CODIGO CLASE:<br>
                <input type="text" name="txtcodigo_clase"> <br>
                CODIGO PRESENTACION:<br>
                <input type="text" name="txtcodigo_presen"> <br>
                <input type="submit" name="accion" value="Guardar"> <br>
            </form>
        </div>
    </center>
    </body>
</html>

