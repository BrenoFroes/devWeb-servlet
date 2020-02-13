/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.dao;

import MODEL.classes.Instrutor;
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
import java.util.List;
import java.util.ArrayList;

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
                    "INSERT INTO turmas(data_inicio, data_fim, carga_horaria) "
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
            stm = con.prepareStatement("UPDATE turmas\n"
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
            stm = con.prepareStatement("select * from turmas where id = ?");
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
    
    //lista todos os alunos
    public List<Turma> buscarTurmas() {
        Connection con = Conexao.getConnection();
        PreparedStatement stm = null;
        ResultSet resultado = null;
        List<Turma> listaTurmas = new ArrayList();
        try {
            stm = con.prepareStatement("select * from turmas;");
            resultado = stm.executeQuery();
            while (resultado.next()) {
                Turma turma = new Turma();
                turma.setId(resultado.getInt("id"));
                turma.setInstrutoresId(resultado.getInt("instrutores_id"));
                turma.setCursosId(resultado.getInt("cursos_id"));
                turma.setDataInicio(resultado.getDate("data_inicio"));
                turma.setDataFim(resultado.getDate("data_final"));
                turma.setCargaHoraria(resultado.getInt("carga_horaria"));
                listaTurmas.add(turma);
            }
        } catch (SQLException ex) {
            System.out.println("Driver não pôde ser carregado: " + ex);
        } finally {
            Conexao.closeConnection(con, null, resultado);
        }
        //Collections.sort(listaAlunos);
        //Collections.sort(listaAlunos, java.util.Comparator.comparing(Aluno::getNome));
        return listaTurmas;
    }
}
