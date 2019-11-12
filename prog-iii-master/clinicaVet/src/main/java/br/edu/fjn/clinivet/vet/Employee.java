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
    @Column(Nullable=false)
    private Integer cpf;
    
    @Column(Nullable=false)
    private String name;
    
    @Column(Nullable=false)
    private Integer senha;
    
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSenha(Integer senha){
        this.senha=senha;
    }
    public String getSenha(){
        return senha;
    }
    public void setCpf(Integer Cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
}
