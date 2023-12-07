<%-- 
    Document   : crud-clases-edit
    Created on : 14 nov 2023, 10:58:36
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clases Editar</title>
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
                <h3>Editar Clases</h3>
            </div>
            <hr>
            <div>
                <form action = "/Siic/ControladorClases" method = "POST">
                    ID_CLASE:<br>
                    <input type="number" name="numberid" value="${clase.getID_CLASE()}"><br>
                    LINK_GRABACION:<br>
                    <input type="text" name="txtlinkgrabacion" value="${clase.getLINK_GRABACION()}"><br>
                    CLASE_DESCRIPCION:<br>
                    <input type="text" name="txtclase" value="${clase.getCLASE_DESCRIPCION()}"><br><br>
                    <input type = "submit" name="accion" value="Actualizar">
                </form>
            </div>
        </center>
    </body>
</html>
