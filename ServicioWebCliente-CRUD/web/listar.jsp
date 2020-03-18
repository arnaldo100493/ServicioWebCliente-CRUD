<%-- 
    Document   : listar
    Created on : 17/03/2020, 06:11:44 PM
    Author     : abarrime
--%>

<%@page import="java.util.List"%>
<%@page import="com.serviciowebclientecrud.controller.UserController"%>
<%@page import="com.serviciowebclientecrud.servicioweb.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="windows-1252">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="resources/css/estilos.css">
        <script type="text/javascript" src="resources/js/formulario.js"></script>
        <title>Usuarios</title>
    </head>
    <body>
        <div style="text-align: center">
            <h1>Usuarios</h1>
        </div>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h5>Usuarios</h5>
                    <a href="./user?accion=agregar" class="btn btn-success">Nuevo Usuario</a>
                    <a href="index.jsp" class="btn btn-info" style="margin-left: 10px;">Volver</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr class="text-center">
                                <th>ID</th>
                                <th>NOMBRES</th>
                                <th>APELLIDOS</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                UserController userController = new UserController();
                                List<User> users = userController.listar();
                                for (User user : users) {

                            %>
                            <tr class="text-center">
                                <td><%=user.getIdUser()%></td>
                                <td><%=user.getFname()%></td>
                                <td><%=user.getLname()%></td>
                                <td>
                                    <a href="./user?accion=editar&id=<%=user.getIdUser()%>" class="btn btn-warning">Editar</a>
                                    <a href="./user?accion=eliminar&id=<%=user.getIdUser()%>" class="btn btn-danger" style="margin-left: 10px;">Eliminar</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
