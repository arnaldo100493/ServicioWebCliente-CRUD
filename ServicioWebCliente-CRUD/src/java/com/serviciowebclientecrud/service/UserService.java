/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviciowebclientecrud.service;

import com.serviciowebclientecrud.servicioweb.User;
import java.util.List;

/**
 *
 * @author abarrime
 */
public interface UserService {

    public List<User> listar();

    public String agregar(String nombre, String apellido);

    public User listarPorIdUser(int idUser);

    public String editar(int idUser, String nombre, String apellido);

    public User eliminar(int idUser);

}
