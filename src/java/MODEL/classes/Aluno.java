/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Breno
 */
public class Aluno {

    private Integer id;
    private String cpf;
    private String nome;
    private String email;
    private String celular;
    private String login;
    private String senha;
    private String endereco;
    private String cidade;
    private String bairro;
    private String cep;
    private String comentario;
    private String aprovado;

    private List<Matricula> matriculas = new ArrayList();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }

    public String getAprovado() {
        return this.aprovado;
    }

    public void insereMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public void removeMatricula(int IDmatricula) {
        for (int i = 0; i < this.matriculas.size(); i++) {
            Matricula matricula = this.matriculas.get(i);
            if (matricula.getId() == IDmatricula) {
                this.matriculas.remove(i);
            }
        }
    }

}
