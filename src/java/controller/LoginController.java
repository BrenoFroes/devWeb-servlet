package controller;
import MODEL.classes.Administrador;
import javax.servlet.http.Cookie;
import MODEL.classes.Aluno;
import MODEL.classes.Instrutor;
import MODEL.dao.AdministradorDAO;
import MODEL.dao.AlunoDAO;
import MODEL.dao.InstrutorDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
    
    AdministradorDAO adminDAO = new AdministradorDAO();
    InstrutorDAO instrutorDAO = new InstrutorDAO();
    AlunoDAO alunoDAO = new AlunoDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //realiza o logout
        request.getSession().setAttribute("admin", null); 
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        request.getSession().setAttribute("aluno", null); 
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        request.getSession().setAttribute("instrutor", null); 
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login = request.getParameter("login");  //recupera o login informado
        String senha = request.getParameter("senha");   //recupera a senha informada
        Administrador admin = new Administrador();
        Instrutor instrutor = new Instrutor();
        Aluno aluno = new Aluno();
        
        admin = adminDAO.validateUser(login, senha);
        instrutor = instrutorDAO.validateUser(login, senha);
        aluno = alunoDAO.validateUser(login, senha);  //valida dados informados
        
        Integer n = admin.getId();
        if(n != null){     
            request.getSession().setAttribute("admin", admin);
            Cookie cookielogin=new Cookie("login",login);   //implementação de cookie dos dados de login
            Cookie cookiesenha= new Cookie("senha",senha);
            cookielogin.setMaxAge(60*60);
            cookiesenha.setMaxAge(60*60);
            response.addCookie(cookielogin);
            response.addCookie(cookiesenha);
            request.getRequestDispatcher("adminController.java").forward(request, response);
        }else{
          boolean erro = true;                      //redireciona com erro se não conseguir autenticar o usuário
          request.setAttribute("errorValidate", erro);
          request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
        n = instrutor.getId();
        if(n != null){     
            request.getSession().setAttribute("instrutor", instrutor);
            Cookie cookielogin=new Cookie("login",login);   //implementação de cookie dos dados de login
            Cookie cookiesenha= new Cookie("senha",senha);
            cookielogin.setMaxAge(60*60);
            cookiesenha.setMaxAge(60*60);
            response.addCookie(cookielogin);
            response.addCookie(cookiesenha);
            request.getRequestDispatcher("instrutorController.java").forward(request, response);
        }else{
          boolean erro = true;                      //redireciona com erro se não conseguir autenticar o usuário
          request.setAttribute("errorValidate", erro);
          request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
        n = aluno.getId();
        if(n != null){     
            request.getSession().setAttribute("aluno", aluno);
            Cookie cookielogin=new Cookie("login",login);   //implementação de cookie dos dados de login
            Cookie cookiesenha= new Cookie("senha",senha);
            cookielogin.setMaxAge(60*60);
            cookiesenha.setMaxAge(60*60);
            response.addCookie(cookielogin);
            response.addCookie(cookiesenha);
            request.getRequestDispatcher("alunoController.java").forward(request, response);
        }else{
          boolean erro = true;                      //redireciona com erro se não conseguir autenticar o usuário
          request.setAttribute("errorValidate", erro);
          request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
    }

}