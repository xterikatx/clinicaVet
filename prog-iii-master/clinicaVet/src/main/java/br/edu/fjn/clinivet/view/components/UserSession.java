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

    private String userName;
    private boolean logged;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isLogged() {
      return userName !=null;
    }

    public void logout() {
        this.userName = null;
        this.logged=false;    
    }

}

