<%-- 
    Document   : crud-clases-add
    Created on : 13 nov 2023, 15:52:03
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clases Agg</title>
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
                <h3>Agregar Clases</h3>
            </div>
            <hr>
            <div>
                <form action = "/Siic/ControladorClases" method = "POST">
                    ID_CLASE:<br>
                    <input type="number" name="numberid"><br>
                    LINK_GRABACION:<br>
                    <input type="text" name="txtlinkgrabacion"><br>
                    CLASE_DESCRIPCION:<br>
                    <input type="text" name="txtclase"><br>
                    <input type = "submit" name="accion" value="Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
