/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Breno
 */
package MODEL.classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Matricula {
    private int id;
    
//    private List<Turma> turmas_id = new ArrayList();
//    
//    private List<Aluno> alunos_id = new ArrayList();
//    
    private Date data_matricula = new Date(); 
    
    private float nota;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setDataMatricula(Date data){
        this.data_matricula = data;
    }
    
    public Date getDataMatricula(){
        return this.data_matricula;
    }
    
    public void setNota(float nota){
        this.nota = nota;
    }
    
    public float getNota(){
        return this.nota;
    }
}
