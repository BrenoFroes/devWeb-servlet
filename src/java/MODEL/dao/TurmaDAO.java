/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;

import MODEL.classes.Turma;
import MODEL.utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodol
 */
public class TurmaDAO {
    public void create(Turma turma) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement(
                    "INSERT INTO turma(data_inicio, data_fim, carga_horaria) "
                    + "VALUES (?,?,?)");
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy"); 
            stm.setString(1, dateFormat.format(turma.getDataInicio()));
            stm.setString(2, dateFormat.format(turma.getDataFim()));
            stm.setString(3, Integer.toString(turma.getCargaHoraria()));
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    public void editar(Turma turma, String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("UPDATE turma\n"
                    + "SET data_inicio = ?,  data_fim = ?, carga_horaria = ?;");
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy"); 
            stm.setString(1, dateFormat.format(turma.getDataInicio()));
            stm.setString(2, dateFormat.format(turma.getDataFim()));
            stm.setString(3, Integer.toString(turma.getCargaHoraria()));
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Turma.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stm);
        }
    }

    public Turma getById(String id) {
        Connection con = Conexao.getConnection();
        PreparedStatement stm;
        ResultSet resultado = null;
        Turma turma = new Turma();

        try {
            stm = con.prepareStatement("select * from turma where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while (resultado.next()) {
                turma.setId(resultado.getInt("id"));
                turma.setCargaHoraria(resultado.getInt("carga_horaria"));
            }

        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:" + ex);
        } finally {
            Conexao.closeConnection(con, null, resultado);
        }
        return turma;
    }
}
