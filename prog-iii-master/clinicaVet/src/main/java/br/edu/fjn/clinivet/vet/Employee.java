/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.vet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author bruno
 */
@Entity
public class Employee {
    
    @Id
    @Column(nullable=false)
    private Integer cpf;
    
    @Column(nullable=false)
    private String name;
    
    @Column(nullable=false)
    private Integer password;
    
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(Integer password){
        this.password=password;
    }
    public Integer getPassword(){
        return password;
    }
    public void setCpf(Integer Cpf){
        this.cpf=cpf;
    }
    public Integer getCpf(){
        return cpf;
    }
}
