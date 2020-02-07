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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Matricula {
    private int id;
    
    private int turmas_id;  
    
    private int alunos_id;
    
    private Date data_matricula = new Date(); 
    
    private float nota;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setTurmasId(int tid){
        this.turmas_id = tid;
    }
    
    public int getTurmasId(){
        return this.turmas_id;
    }
    
    public void setAlunos(int aid){
        this.turmas_id = aid;
    }
    
    public int getAlunosId(){
        return this.alunos_id;
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
    
    public String getDataMatriculaString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String data = dateFormat.format(this.data_matricula);
        return data;
    }
}
