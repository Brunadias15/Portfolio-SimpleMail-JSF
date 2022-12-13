/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.perfil.modelo;


public class Perfil {
    private String nome;
    private String email;
    private String mensagem;
    private String assunto;

    public Perfil() {
    }

    public Perfil(String nome, String email, String mensagem, String assunto) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
        this.assunto = assunto;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
     
    
}
