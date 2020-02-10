/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import MODEL.classes.Curso;
import MODEL.dao.CursoDAO;
import java.io.IOException;
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
@WebServlet(urlPatterns = {"/controller/CursoController"})
public class CursoController extends HttpServlet{
    
    private CursoDAO cursoDAO = new CursoDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Curso curso = new Curso();
        
        curso.setNome(request.getParameter("nome"));
        curso.setRequisito(request.getParameter("requisito"));
        curso.setEmenta(request.getParameter("ementa"));
        curso.setCargaHoraria(Integer.parseInt(request.getParameter("cargaHoraria")));
        curso.setPreco(Double.parseDouble(request.getParameter("preco")));
        
        cursoDAO.create(curso);
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
    }
 }
