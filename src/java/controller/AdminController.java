/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import MODEL.classes.Administrador;
import MODEL.dao.AdministradorDAO;
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
 * @author rodol
 */
@WebServlet(urlPatterns = {"/controller/AdminController"})
public class AdminController extends HttpServlet{
    
    private AdministradorDAO adminDAO = new AdministradorDAO();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)//cria ou edita usuario
            throws ServletException, IOException {
        Administrador admin = new Administrador();
        
        admin.setNome(request.getParameter("nome"));
        admin.setLogin(request.getParameter("login"));
        admin.setSenha(request.getParameter("senha"));
        
        adminDAO.create(admin);
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
    }
}
