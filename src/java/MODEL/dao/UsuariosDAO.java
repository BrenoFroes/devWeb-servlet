/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;
import MODEL.classes.Aluno;
import MODEL.classes.Instrutor;
import MODEL.classes.Administrador;
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
public class UsuariosDAO{
    

   
     
    //recuperar Usuario informando o 'id' do mesmo
    public Aluno getById (String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Aluno aluno = new Aluno();
        
        try{
            stm = con.prepareStatement("select * from aluno where id = ?");
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
            stm = con.prepareStatement("select * from aluno where login = ? and senha = ?");
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