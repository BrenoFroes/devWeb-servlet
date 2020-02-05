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

public class Turma {
    private int id;
    
    private List<Matricula> matriculas = new ArrayList();
    
    private Date data_inicio = new Date(); 
    
    private Date data_fim = new Date(); 
    
    private int carga_horaria;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setDataInicio(Date data){
        this.data_inicio = data;
    }
    
    public Date getDataInicio(){
        return this.data_inicio;
    }
    
    public void setDataFim(Date data){
        this.data_fim = data;
    }
    
    public Date getDataFim(){
        return this.data_fim;
    }
    
    public void setCargaHoraria(int carga){
        this.carga_horaria = carga;
    }
    
    public int getCargaHoraria(){
        return this.carga_horaria;
    }
    public void insereMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }
    public void removeMatricula(int IDmatricula){
        for(int i=0; i<this.matriculas.size(); i++){
            Matricula matricula = this.matriculas.get(i);
            if(matricula.getId() == IDmatricula){
                this.matriculas.remove(i);
            }
        }
    }
}
