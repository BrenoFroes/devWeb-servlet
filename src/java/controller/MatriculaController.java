/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import MODEL.classes.Matricula;
import MODEL.dao.MatriculaDAO;
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
@WebServlet(urlPatterns = {"/controller/MatriculaController"})
public class MatriculaController extends HttpServlet{
    
    private MatriculaDAO matriculaDAO = new MatriculaDAO();
    
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
        Matricula matricula = new Matricula();
        
        //matricula.setAluno(request.getParameter("turma"));
        //matricula.setLogin(request.getParameter("login"));
        //matricula.setSenha(request.getParameter("senha"));
        
        matriculaDAO.create(matricula);
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
    }
}
