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

public class Administrador {
    private int id;
   
    private String login;
    
    private String senha;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
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
    
}