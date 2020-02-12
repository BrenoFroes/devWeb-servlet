/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;

import MODEL.classes.Instrutor;
import MODEL.utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodol
 */
public class InstrutorDAO {

    public void create(Instrutor instrutor) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement(
                    "INSERT INTO instrutores(nome, email, valor_hora, login, senha, experiencia) "
                    + "VALUES (?,?,?,?,?,?)");
            stm.setString(1, instrutor.getNome());
            stm.setString(2, instrutor.getEmail());
            stm.setString(3, Integer.toString(instrutor.getValorHora()));
            stm.setString(4, instrutor.getLogin());
            stm.setString(5, instrutor.getSenha());
            stm.setString(6, instrutor.getExperiencia());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Instrutor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    public void editar(Instrutor instrutor, String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("UPDATE instrutores\n"
                    + "SET nome = ?,  email = ?, valor_hora = ?,\n"
                    + "login = ?, senha = ?, experiencia = ?;");
            stm.setString(1, instrutor.getNome());
            stm.setString(2, instrutor.getEmail());
            stm.setString(3, Integer.toString(instrutor.getValorHora()));
            stm.setString(4, instrutor.getLogin());
            stm.setString(5, instrutor.getSenha());
            stm.setString(6, instrutor.getExperiencia());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Instrutor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    public Instrutor getById(String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm;
        ResultSet resultado = null;
        Instrutor instrutor = new Instrutor();

        try {
            stm = con.prepareStatement("select * from cursos where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                instrutor.setId(resultado.getInt("id"));
                instrutor.setNome(resultado.getString("nome"));
            }

        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:" + ex);
        } finally {
            Conexao.closeConnection(con, null, resultado);
        }
        return instrutor;
    }

    public Instrutor validateUser(String login, String senha) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm;
        ResultSet resultado = null;
        Instrutor instrutor = new Instrutor();
        try {
            stm = con.prepareStatement("select * from instrutores where login = ? and senha = ?");
            stm.setString(1, login);
            stm.setString(2, senha);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                instrutor.setId(resultado.getInt("id"));
                instrutor.setNome(resultado.getString("nome"));
                instrutor.setEmail(resultado.getString("email"));
            }
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:" + ex);
        } finally {
            Conexao.closeConnection(con, null, resultado);
        }
        return instrutor;
    }
}
