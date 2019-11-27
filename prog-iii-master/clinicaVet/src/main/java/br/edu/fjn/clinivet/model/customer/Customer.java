/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.customer;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author aluno
 */

@Entity
public class Customer implements Serializable  {
    
@Id
@Column(nullable = false)
private String cpf;

@Column(nullable = false)
private String password;

@Column(nullable = false)
private String name;

private String address;

@Column(nullable = false)
    private String id;

public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 /* 

    @Column(nullable = false)
    private String name;

    private String adress;
    @Column(nullable = false)
    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Id
    @Column(nullable = false)
    private String cpf;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void gerarId() {
        this.id = UUID.randomUUID().toString();
    }
*/

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
