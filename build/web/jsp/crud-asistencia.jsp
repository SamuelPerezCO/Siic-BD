<%-- 
    Document   : crud-asistencia
    Created on : 5 nov 2023, 14:36:13
    Author     : serna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="../img/img-Poli3.png">
        <title>CRUD Asistencia</title>
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
    <center>
        <div>
            <h3>CRUD-Asistencia</h3>
            <form action="/Siic/ControladorAsis" method="POST">
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
                        <th>DIA</th>
                        <th>MES</th>
                        <th>ANIO</th>
                        <th>CODIGO_CLASE_ASISTENCIA</th>
                        <th>ID_USUARIO_ASISTENCIA</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getDIA()}</td>
                            <td>${dato.getMES()}</td>
                            <td>${dato.getANIO()}</td>
                            <td>${dato.getCODIGO_CLASE_ASISTENCIA()}</td>
                            <td>${dato.getID_USUARIO_ASISTENCIA()}</td>
                            <td>
                                <form action="/Siic/ControladorAsis" method="POST">
                                    <input type="hidden" name="Id_asistencia" value="${dato.getID_USUARIO_ASISTENCIA()}">
                                    <input type = "submit" name = "accion" value="Editar">
                                    <input type="submit" name = "accion" value="Borrar">
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