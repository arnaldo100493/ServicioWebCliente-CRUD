/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviciowebclientecrud.web.servlet;

import com.serviciowebclientecrud.controller.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abarrime
 */
//@WebServlet(name = "User", urlPatterns = {"/user", "/userServlet"})
public class UserServlet extends HttpServlet {

    public UserServlet() {

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String acceso = "";
        String index = "index.jsp";
        String listar = "vistas/listar.jsp";
        String agregar = "vistas/agregar.jsp";
        String editar = "vistas/editar.jsp";
        String accion = request.getParameter("accion");
        UserController userController = new UserController();

        if (accion.equals("agregar")) {
            acceso = agregar;

        } else if (accion.equals("listar")) {
            acceso = listar;
        } else if (accion.equals("Guardar")) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            userController.agregar(nombre, apellido);
            acceso = listar;

        } else if (accion.equals("editar")) {
            acceso = editar;
            String id = request.getParameter("id");
            request.setAttribute("idUser", id);
        } else if (accion.equals("Actualizar")) {
            int idUser = Integer.parseInt(request.getParameter("idUser"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            userController.editar(idUser, nombre, apellido);
            acceso = listar;
        } else if (accion.equals("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            userController.eliminar(id);
            acceso = listar;
        } else {
            acceso = listar;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
