<%--
    Document   : editar
    Created on : 17/03/2020, 10:35:59 PM
    Author     : abarrime
--%>

<%@page import="com.serviciowebclientecrud.servicioweb.User"%>
<%@page import="com.serviciowebclientecrud.controller.UserController"%>
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
        <title>Actualizar Usuarios</title>
        <link rel="stylesheet" href="resources/css/estilos.css">
        <script type="text/javascript" src="resources/js/formulario.js"></script>
    </head>
    <body>
        <div style="text-align: center">
            <h1>Actualizar Usuarios</h1>
        </div>
        <%
            int id = Integer.parseInt((String) request.getAttribute("idUser"));
            UserController userController = new UserController();
            User user = userController.listarPorIdUser(id);
        %>
        <div class="container col-md-6">
            <div class="card">
                <div class="card-header">
                    <h5>Agregar Nuevo Usuario</h5>
                </div>
                <div class="card-body">
                    <form action="./user" method="get">
                        <div class="form-group">
                            <label for="">Id:</label>
                            <input id="txtId" type="text" value="<%=user.getIdUser()%>" name="idUser" readonly="true" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="">Nombres:</label>
                            <input id="txtNombre" type="text" value="<%=user.getFname()%>" name="nombre" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="">Apellidos:</label>
                            <input id="txtApellido" type="text" value="<%=user.getLname()%>" name="apellido" class="form-control">
                        </div>
                        <input id="btnActualizar" type="submit" name="accion" class="btn btn-success" value="Actualizar">
                        <a href="./user?accion=listar" class="btn btn-info" style="margin-left: 10px;">Volver</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>