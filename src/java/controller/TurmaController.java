
package controller;

import MODEL.classes.Turma;
import MODEL.dao.TurmaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rodol
 */
public class TurmaController extends HttpServlet {
    
    private TurmaDAO turmaDAO = new TurmaDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Turma> turmas = new ArrayList();
        turmas = turmaDAO.buscarTurmas();
        request.setAttribute("turmas", turmas);
        request.getRequestDispatcher("centralAdministrador.jsp").forward(request, response);    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Turma turma = new Turma();
        
        
    }
    
}