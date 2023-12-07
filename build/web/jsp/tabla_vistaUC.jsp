<%-- 
    Document   : tabla_vistaUC
    Created on : 29/11/2023, 7:23:52 p. m.
    Author     : Juan Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="../img/img-Poli3.png">
        <title>VISTA DE USUARIOS QUE ASISTIERON A CIERTA CLASE</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }

            header {
                background-color: #333;
                color: white;
                padding: 10px 0;
                text-align: center;
            }

            .container {
                display: flex;
                justify-content: space-between;
                align-items: center;
                max-width: 960px;
                margin: 0 auto;
            }

            .navbar a {
                color: white;
                text-decoration: none;
                padding: 10px;
                margin: 0 10px;
                border-radius: 5px;
                background-color: #555;
            }

            .content {
                max-width: 800px;
                margin: 20px auto;
                padding: 20px;
                background-color: white;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
            }

            th, td {
                padding: 10px;
                text-align: left;
                border: 1px solid #ddd;
            }

            th {
                background-color: #333;
                color: white;
            }

            tr:nth-child(even) {
                background-color: #f9f9f9;
            }

            form {
                display: inline-block;
            }
        </style>
    </head>
    <body>
        <center>
            <div>
                <h3>USUARIOS QUE ASISTIERON A CIERTA CLASE</h3>
                <form action = "/Siic/ControladorVistaUC" method="POST">
                    <input type="submit" name="accion" value="Listar">                    
                </form>
            </div>
            <form action="/Siic/ControladorVolver" method="POST">
                <input type="submit" name="accion" value="volver">
            </form>
            <div>
                <table border="1">
                    <thead>
                        <tr>
                            <th>CLASE</th>
                            <th>NOMBRE</th>
                            <th>APELLIDO</th>
                            <th>CORREO</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var = "dato" items = "${datos}">
                            <tr>
                                <td>${dato.getClase_descripcion()}</td>
                                <td>${dato.getUs_nombre()}</td>
                                <td>${dato.getUs_apellido()}</td>
                                <td>${dato.getCorreo()}</td>
                                                                    
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </center>
    </body>
</html>