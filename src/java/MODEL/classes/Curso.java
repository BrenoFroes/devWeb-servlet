/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.classes;
import java.util.ArrayList;
import java.util.List;
/**
/**
 *
 * @author Breno
 */
public class Curso {
    private int id;
    
    private String nome;
    
    private String requisito;
    
    private String ementa;
    
    private int carga_horaria;
    
    private Double preco;
    
    private List<Turma> turmas = new ArrayList();
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setRequisito(String requisito){
        this.requisito = requisito;
    }
    
    public String getRequisito(){
        return this.requisito;
    }
    
    public void setEmenta(String ementa){
        this.ementa = ementa;
    }
    
    public String getEmenta(){
        return this.ementa;
    }
    
    public void setCargaHoraria(int carga){
        this.carga_horaria = carga;
    }
    
    public int getCargaHoraria(){
        return this.carga_horaria;
    }
    
    public void setPreco(Double preco){
        this.preco = preco;
    }
    
    public Double getPreco(){
        return this.preco;
    }
    
    public void inserteTurma(Turma turma){
        this.turmas.add(turma);
    }
    public void removeTurma(int IDturma){
        for(int i=0; i<this.turmas.size(); i++){
            Turma turma = this.turmas.get(i);
            if(turma.getId() == IDturma){
                this.turmas.remove(i);
            }
        }
    }
}
