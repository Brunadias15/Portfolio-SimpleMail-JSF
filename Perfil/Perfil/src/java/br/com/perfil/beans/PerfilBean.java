/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.perfil.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

@ManagedBean
@SessionScoped
public class PerfilBean {
    private String nome;
    private String email;
    private String mensagem;
    private String assunto;
    

    public PerfilBean() {
    }

    public PerfilBean(String nome, String email, String mensagem, String assunto) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
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

    public void enviarEmail(){
    SimpleEmail emailE =new SimpleEmail();
      emailE.setSSLOnConnect(true);
      emailE.setHostName("smtp.gmail.com");
      emailE.setSslSmtpPort("587");
      emailE.setAuthenticator(new DefaultAuthenticator("Colocar seu email aqui", "colocar sua senha"));
        try {
           
            emailE.setFrom("Colocar seu email aqui", email);
            emailE.setDebug(true);
            emailE.setSubject(assunto);
            emailE.setMsg("\n" + this.mensagem + "\n\n\nEmail para contato: " + this.email + "\n\nAtt. " + this.nome);
            emailE.addTo("Colocar seu email aqui");
            emailE.setSSL(true);
            emailE.setTLS(true);

            emailE.send();
            System.out.println("email enviado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void limpar(){
        nome = "";
        email= "";
        assunto = "";
        mensagem="";
    }
    }
    
