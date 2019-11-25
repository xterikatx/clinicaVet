/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.vet;

import br.edu.fjn.clinivet.model.customer.Animal;
import br.edu.fjn.clinivet.model.service.Services;
import javax.inject.Named;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author aluno
 */
@Entity
public class Vet {
    
    @Id
    @Column(nullable = false)
    private String CRM;
    
    @Column(nullable = false)
    private String name;
    
   
       
    @Column(nullable = false)
    private String CPF;
    
    @Column(nullable = false)
    private String password;
    
    
    
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
