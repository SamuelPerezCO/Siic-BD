<%-- 
    Document   : crud-asistencia-add
    Created on : 15 nov 2023, 19:44:00
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Asistencias</title>
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
            <h3>Agregar Asistencias</h3>
        </div>
        <hr>
        <div>
            <form action="/Siic/ControladorAsis" method="POST">
                DIA:<br>
                <input type="number" name="intDia"><br>
                MES:<br>
                <input type ="number" name="intMes"><br>
                AÑO:<br>
                <input type="number" name="intAnio"><br>
                CODIGO_CLASE_ASISTENCIA:<br>
                <input type = "number" name="intCodigoCA"><br>
                CODIGO_USUARIO_ASISTENCIA:<br>
                <input type = "number" name = "intCodigoUA"><br>
                <input type="submit" name="accion" value="Guardar">
            </form>
        </div>
    </center>
    </body>
</html>
