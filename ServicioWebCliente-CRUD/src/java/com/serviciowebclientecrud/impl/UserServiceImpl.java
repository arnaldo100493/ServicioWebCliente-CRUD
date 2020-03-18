/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviciowebclientecrud.impl;

import com.serviciowebclientecrud.service.UserService;
import com.serviciowebclientecrud.servicioweb.User;

/**
 *
 * @author abarrime
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {

    }

    @Override
    public java.util.List<com.serviciowebclientecrud.servicioweb.User> listar() {
        com.serviciowebclientecrud.servicioweb.ServicioWeb_Service service = new com.serviciowebclientecrud.servicioweb.ServicioWeb_Service();
        com.serviciowebclientecrud.servicioweb.ServicioWeb port = service.getServicioWebPort();
        return port.listar();
    }

    @Override
    public String agregar(java.lang.String nombre, java.lang.String apellido) {
        com.serviciowebclientecrud.servicioweb.ServicioWeb_Service service = new com.serviciowebclientecrud.servicioweb.ServicioWeb_Service();
        com.serviciowebclientecrud.servicioweb.ServicioWeb port = service.getServicioWebPort();
        return port.agregar(nombre, apellido);
    }

    @Override
    public User listarPorIdUser(int idUser) {
        com.serviciowebclientecrud.servicioweb.ServicioWeb_Service service = new com.serviciowebclientecrud.servicioweb.ServicioWeb_Service();
        com.serviciowebclientecrud.servicioweb.ServicioWeb port = service.getServicioWebPort();
        return port.listarPorIdUser(idUser);
    }

    @Override
    public String editar(int idUser, java.lang.String nombre, java.lang.String apellido) {
        com.serviciowebclientecrud.servicioweb.ServicioWeb_Service service = new com.serviciowebclientecrud.servicioweb.ServicioWeb_Service();
        com.serviciowebclientecrud.servicioweb.ServicioWeb port = service.getServicioWebPort();
        return port.editar(idUser, nombre, apellido);
    }

    @Override
    public User eliminar(int idUser) {
        com.serviciowebclientecrud.servicioweb.ServicioWeb_Service service = new com.serviciowebclientecrud.servicioweb.ServicioWeb_Service();
        com.serviciowebclientecrud.servicioweb.ServicioWeb port = service.getServicioWebPort();
        return port.eliminar(idUser);
    }

}
