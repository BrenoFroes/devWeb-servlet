/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;

import MODEL.classes.Curso;
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
public class CursoDAO {

    public void create(Curso curso) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement(
                    "INSERT INTO cursos(nome, requisito, ementa, carga_horaria, preco) "
                    + "VALUES (?,?,?,?,?) ");
            stm.setString(1, curso.getNome());
            stm.setString(2, curso.getRequisito());
            stm.setString(3, curso.getEmenta());
            stm.setString(4, Integer.toString(curso.getCargaHoraria()));
            stm.setString(5, Double.toString(curso.getPreco()));
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    /*public void editar(Curso curso, String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("UPDATE curso\n"
                    + "SET nome = ?,  requisito = ?, ementa = ?,\n"
                    + "carga_horaria = ?, preco = ?;");
            stm.setString(1, curso.getNome());
            stm.setString(2, curso.getRequisito());
            stm.setString(3, curso.getEmenta());
            stm.setString(4, Integer.toString(curso.getCargaHoraria()));
            stm.setString(5, Double.toString(curso.getPreco()));
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    public Curso getById(String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm;
        ResultSet resultado = null;
        Curso curso = new Curso();

        try {
            stm = con.prepareStatement("select * from curso where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                curso.setId(resultado.getInt("id"));
                curso.setNome(resultado.getString("nome"));
            }

        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:" + ex);
        } finally {
            Conexao.closeConnection(con, null, resultado);
        }
        return curso;
    }*/
}
