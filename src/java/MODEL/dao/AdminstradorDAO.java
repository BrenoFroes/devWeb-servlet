/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;
import MODEL.utilitarios.Conexao;
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
public class AdminstradorDAO {
    
    
    //inserir novo usuário na tabela 'usuario'
    public void create (Administrador admin){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        try {
            stm=con.prepareStatement("INSERT INTO administrador(nome,login,senha) VALUES (?,?,?) ");
            stm.setString(1,admin.getNome());
            stm.setString(2,admin.getLogin());
            stm.setString(3, admin.getSenha());
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
    //edita um usuario
    public void editar (Administrador admin, String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        try {
            stm=con.prepareStatement("UPDATE administrador\n" +
                                    "SET login = ?,  senha = ?, \n" +
                                    "where id = ?;");
            stm.setString(1, admin.getLogin());
            stm.setString(2, admin.getSenha());
            stm.setString(8, id);
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
     
    //recuperar Usuario informando o 'id' do mesmo
    public Administrador getById (String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Administrador admin = new Administrador();
        
        try{
            stm = con.prepareStatement("select * from administrador where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while(resultado.next()){
               admin.setId(resultado.getInt("id"));
               admin.setLogin(resultado.getString("login"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
        return admin;
    }
    
    //validar se Usuario existe no banco de dados através de seu email e senha para Login
    public Administrador validateUser (String login, String senha){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Administrador admin = new Administrador();
        try{
            stm = con.prepareStatement("select * from administrador where login = ? and senha = ?");
            stm.setString(1, login);
            stm.setString(2,senha);
            resultado = stm.executeQuery();
            while(resultado.next()){
               admin.setId(resultado.getInt("id"));
               admin.setLogin(resultado.getString("login"));
               admin.setSenha(resultado.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
        return admin;
    } 
}