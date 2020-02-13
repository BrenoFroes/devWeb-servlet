package controller;

import MODEL.dao.AlunoDAO;
import MODEL.classes.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/controller/AlunoController"})
public class AlunoController extends HttpServlet {

    private AlunoDAO alunoDAO = new AlunoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Aluno> alunos = new ArrayList();
        alunos = alunoDAO.buscarAlunos();
        request.setAttribute("alunos", alunos);
        request.getRequestDispatcher("centralAdministrador.jsp").forward(request, response);    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Aluno aluno = new Aluno();

        aluno.setCpf(request.getParameter("cpf"));
        aluno.setNome(request.getParameter("nome"));
        aluno.setEmail(request.getParameter("email"));
        aluno.setCelular(request.getParameter("celular"));
        aluno.setLogin(request.getParameter("login"));
        aluno.setSenha(request.getParameter("senha"));
        aluno.setEndereco(request.getParameter("endereco"));
        aluno.setCidade(request.getParameter("cidade"));
        aluno.setBairro(request.getParameter("bairro"));
        aluno.setCep(request.getParameter("cep"));
        aluno.setComentario("oi");
        aluno.setAprovado("1");

        alunoDAO.create(aluno);
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
    }
}
