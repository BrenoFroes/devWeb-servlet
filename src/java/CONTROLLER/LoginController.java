package CONTROLLER;
import javax.servlet.http.Cookie;
import MODEL.classes.Aluno;
import MODEL.dao.AlunoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Victor
 */
public class LoginController extends HttpServlet {
    
    AlunoDAO alunoDAO = new AlunoDAO();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //realiza o logout
        request.getSession().setAttribute("aluno", null); 
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");  //recupera o login informado
        String senha = request.getParameter("senha");   //recupera a senha informada
        Aluno aluno = new Aluno();
        
        aluno = alunoDAO.validateUser(login, senha);  //valida dados informados
        if(aluno.getId()!= null){     
            request.getSession().setAttribute("aluno", aluno);
            Cookie cookielogin=new Cookie("login",login);   //implementação de cookie dos dados de login
            Cookie cookiesenha= new Cookie("senha",senha);
            cookielogin.setMaxAge(60*60);
            cookiesenha.setMaxAge(60*60);
            response.addCookie(cookielogin);
            response.addCookie(cookiesenha);
        }else{
          boolean erro = true;                      //redireciona com erro se não conseguir autenticar o usuário
          request.setAttribute("errorValidate", erro);
          request.getRequestDispatcher("login.jsp").forward(request, response);
        }    
    }

}