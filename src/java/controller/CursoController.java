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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rodol
 */
public class CursoController {
    private CursoDAO cursodao;
    
    
    public CursoController(){
        super();
        cursodao = new CursoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");//cria uma variavel que define a acao do doGet
        // Long idPersona = Long.parseLong(request.getParameter("idPersonagem"));
        Curso curso = (Curso)request.getSession().getAttribute("curso");
//        if("add".equals(acao)){//se acao for "add", adiciona personagem favorito do Aluno
//            cursodao.addFavorito(aluno.getId(), idPersona);
//            aluno.insereFavorito(personagemDao.getById(idPersona.toString()));
//        }else{//se acao nao for "add", remove personagem favorito do Aluno
//            cursodao.removeFavorito(user.getId(), idPersona);
//            user.removeFavorito(idPersona);
//        }
        request.getSession().setAttribute("curso", curso);//salva Aluno na seção
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)//cria ou edita Aluno
            throws ServletException, IOException {
        Curso curs= new Curso();
        
        curs.setNome(request.getParameter("nome"));
        curs.setRequisito(request.getParameter("requisito"));
        curs.setEmenta(request.getParameter("ementa"));
        curs.setCargaHoraria(Integer.parseInt(request.getParameter("cargaHoraria")));
        curs.setPreco(Double.parseDouble(request.getParameter("preco")));
  
        if(request.getParameter("editar") == null)//se a variavel for null, cria curso
        {
            this.cursodao.create(curs);
            RequestDispatcher view= request.getRequestDispatcher("/cursos.jsp");//redireciona para pagina de login
            view.forward(request, response);
        }
        else if (request.getParameter("editar").equals("editar"))//se nao for igual a "editar", edita o curso
        {
            this.cursodao.editar(curs, request.getParameter("idCurso"));
            RequestDispatcher view= request.getRequestDispatcher("/cursos.jsp");//redireciona para index
            view.forward(request, response);
        }
    }
 }

}
