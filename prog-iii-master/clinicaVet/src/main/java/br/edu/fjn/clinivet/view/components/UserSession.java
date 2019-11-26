/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.view.components;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author vinicius
 */
@SessionScoped
@Named("userSession")
public class UserSession implements Serializable {

    private String cpf;
    private boolean logged;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isLogged() {
        return cpf != null ;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    

    public void logout() {
        this.cpf = null;
        this.logged=false;    
    }

}

