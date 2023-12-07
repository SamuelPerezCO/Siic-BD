<%-- 
    Document   : crud-usuarios
    Created on : 5 nov 2023, 14:33:49
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
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
                <h3>Usuarios</h3>
                <form action="/Siic/HomeController" method="POST">
                    <input type="submit" name="accion" value="Listar">
                    <input type="submit" name="accion" value="Nuevo">
                </form>
            </div>
            <form action="/Siic/ControladorVolver" method="POST">
                <input type="submit" name="accion" value="volver">
            </form>
            <div>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID_USUARIO:</th>
                            <th>CONTRASEÑA:</th>
                            <th>US_NOMBRE:</th>
                            <th>US_APELLIDO:</th>
                            <th>US_SEGAPELLIDO:</th>
                            <th>CORREO:</th>
                            <th>CODIGO_PERFIL:</th>
                            <th>ACCIONES:</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId_usuario()}</td>
                            <td>${dato.getContrasenia()}</td>
                            <td>${dato.getCc_nombre()}</td>
                            <td>${dato.getCc_apellido()}</td>
                            <td>${dato.getCc_segApellido()}</td>
                            <td>${dato.getCorreo()}</td>
                            <td>${dato.getCodigo_perfil()}</td>
                            <td>
                                <form action="/Siic/HomeController" method = "POST">
                                    <input type="hidden" name="id" value="${dato.getId_usuario()}">
                                    <input type = "submit" name = "accion" value="Editar">
                                    <input type="submit" name="accion" value="Borrar">
                                </form>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </center>
    </body>
</html>
