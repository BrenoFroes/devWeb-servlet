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
public class Instrutor {
    private int id;
    
    private String nome;
    
    private String email;
   
    private int valor_hora;
    
    private String login;
    
    private String senha;
    
    private String experiencia;
    
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
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setValorHora(int valor){
        this.valor_hora = valor;
    }
    
    public int getValorHora(){
        return this.valor_hora;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return this.login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setExperiencia(String experiencia){
        this.experiencia = experiencia;
    }
    
    public String getExperiencia(){
        return this.experiencia;
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
