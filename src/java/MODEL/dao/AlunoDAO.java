/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;
import MODEL.classes.Aluno;
import MODEL.utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Breno
 */
public class AlunoDAO{
    
    public void create (Aluno aluno){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        try {
            stm=con.prepareStatement(
                "INSERT INTO alunos(cpf, nome, email, celular, login, senha, endereco, cidade, bairro, cep, comentario, aprovado) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setString(1, aluno.getCpf());
            stm.setString(2, aluno.getNome());
            stm.setString(3, aluno.getEmail());
            stm.setString(4, aluno.getCelular());
            stm.setString(5, aluno.getLogin());
            stm.setString(6, aluno.getSenha());
            stm.setString(7, aluno.getEndereco());
            stm.setString(8, aluno.getCidade());
            stm.setString(9, aluno.getBairro());
            stm.setString(10, aluno.getCep());
            stm.setString(11, aluno.getComentario());
            stm.setString(12, aluno.getAprovado());
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
    //edita um usuario
    public void editar (Aluno aluno, String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        try {
            stm=con.prepareStatement("UPDATE alunos\n" +
                                    "SET cpf = ?,  nome = ?, email = ?,\n"+
                                    "celular = ?, login = ?, senha = ?, \n" +
                                    "endereco = ?, cidade = ?, bairro = ? \n" +
                                    "cep = ?, comentario = ?, aprovado = ?\n" +
                                    "where id = ?;");
            stm.setString(1, aluno.getCpf());
            stm.setString(2, aluno.getNome());
            stm.setString(3, aluno.getEmail());
            stm.setString(4, aluno.getCelular());
            stm.setString(5, aluno.getLogin());
            stm.setString(6, aluno.getSenha());
            stm.setString(7, aluno.getEndereco());
            stm.setString(8, aluno.getCidade());
            stm.setString(9, aluno.getBairro());
            stm.setString(10, aluno.getCep());
            stm.setString(11, aluno.getComentario());
            stm.setString(12, aluno.getAprovado());
            stm.setString(13, id);
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
    
    public void delete (String id){
        PreparedStatement stm; 
        ResultSet resultado = null;
        Connection con = Conexao.getConnection();
        
        Aluno aluno = new Aluno();
        
        try {
            stm=con.prepareStatement("DELETE FROM cursos where id = ?;");
            stm.setString(1, id);
            stm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
    }
     
    //recuperar Usuario informando o 'id' do mesmo
    public Aluno getById (String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Aluno aluno = new Aluno();
        
        try{
            stm = con.prepareStatement("select * from alunos where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while(resultado.next()){
               aluno.setId(resultado.getInt("id"));
               aluno.setLogin(resultado.getString("login"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
        return aluno;
    }
    
    //validar se Usuario existe no banco de dados através de seu email e senha para Login
    public Aluno validateUser (String login, String senha){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Aluno aluno = new Aluno();
        try{
            stm = con.prepareStatement("select * from alunos where login = ? and senha = ?");
            stm.setString(1, login);
            stm.setString(2, senha);
            resultado = stm.executeQuery();
            while(resultado.next()){
               aluno.setId(resultado.getInt("id"));
               aluno.setCpf(resultado.getString("cpf"));
               aluno.setNome(resultado.getString("nome"));
            }
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
        return aluno;
    } 
}