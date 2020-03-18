/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviciowebclientecrud.controller;

import com.serviciowebclientecrud.impl.UserServiceImpl;
import com.serviciowebclientecrud.service.UserService;
import com.serviciowebclientecrud.servicioweb.User;
import java.util.List;

/**
 *
 * @author abarrime
 */
public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    public List<User> listar() {
        return this.userService.listar();
    }

    public String agregar(String nombre, String apellido) {
        return this.userService.agregar(nombre, apellido);
    }

    public User listarPorIdUser(int idUser) {
        return this.userService.listarPorIdUser(idUser);
    }

    public String editar(int idUser, String nombre, String apellido) {
        return this.userService.editar(idUser, nombre, apellido);
    }

    public User eliminar(int idUser) {
        return this.userService.eliminar(idUser);
    }

}
