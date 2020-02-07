
package CONTROLLER;

import MODEL.dao.AlunoDAO;
import MODEL.classes.Aluno;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author victo
 */
public class UsuarioAlunoController extends HttpServlet {
    
    private AlunoDAO alunodao;
    
    
    public UsuarioAlunoController(){
        super();
        alunodao=new AlunoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");//cria uma variavel que define a acao do doGet
        // Long idPersona = Long.parseLong(request.getParameter("idPersonagem"));
        Aluno aluno = (Aluno)request.getSession().getAttribute("aluno");
//        if("add".equals(acao)){//se acao for "add", adiciona personagem favorito do Aluno
//            alunodao.addFavorito(aluno.getId(), idPersona);
//            aluno.insereFavorito(personagemDao.getById(idPersona.toString()));
//        }else{//se acao nao for "add", remove personagem favorito do Aluno
//            alunodao.removeFavorito(user.getId(), idPersona);
//            user.removeFavorito(idPersona);
//        }
        request.getSession().setAttribute("aluno", aluno);//salva Aluno na seção
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)//cria ou edita Aluno
            throws ServletException, IOException {
        Aluno alun= new Aluno();
        
        alun.setCpf(request.getParameter("cpf"));
        alun.setNome(request.getParameter("nome"));
        alun.setEmail(request.getParameter("email"));
        alun.setCelular(request.getParameter("celular"));
        alun.setLogin(request.getParameter("login"));
        alun.setSenha(request.getParameter("senha"));
        alun.setEndereco(request.getParameter("endereco"));
        alun.setCidade(request.getParameter("cidade"));
        alun.setBairro(request.getParameter("bairro"));
        alun.setCep(request.getParameter("cep"));
        alun.setComentario(request.getParameter("comentario"));
        alun.setAprovado(request.getParameter("aprovado"));
  
        if(request.getParameter("editar") == null)//se a variavel for null, cria Aluno
        {
            this.alunodao.create(alun);
            RequestDispatcher view= request.getRequestDispatcher("/.jsp");//redireciona para pagina de login
            view.forward(request, response);
        }
        else if (request.getParameter("editar").equals("editar"))//se nao for igual a "editar", edita o Aluno
        {
            this.alunodao.editar(alun, request.getParameter("idAluno"));
            RequestDispatcher view= request.getRequestDispatcher("/index.jsp");//redireciona para index
            view.forward(request, response);
        }
    }
 }
