/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import MODEL.classes.Instrutor;
import MODEL.dao.InstrutorDAO;
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
@WebServlet(urlPatterns = {"/controller/IntrutorController"})
public class InstrutorController extends HttpServlet {

    private InstrutorDAO instrutorDAO = new InstrutorDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("Servlet ok");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Instrutor instrutor = new Instrutor();

        instrutor.setNome(request.getParameter("nome"));
        instrutor.setEmail(request.getParameter("email"));
        instrutor.setValorHora(Integer.parseInt(request.getParameter("hora")));
        instrutor.setLogin(request.getParameter("login"));
        instrutor.setSenha(request.getParameter("senha"));

        instrutorDAO.create(instrutor);
        RequestDispatcher view = request.getRequestDispatcher("../index.jsp");
        view.forward(request, response);
    }

}
