/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.vet;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 *
 * @author bruno
 */
@Entity
public class Animal {

    @Column(Nullable=false)
    private String name;
    
    @Id
    @Column(Nullable=false)
    private Integer cod;
    
    private String postage;
    
    private String type;
    
    private String breed;
    
        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
     public void setPostage(String postage){
        this.postage=postage;
    }
    public String getPostage(){
        return postage;
    }
    @PrePersist
    public void gerarCod(){
        this.cod=UUID.randomUUID().toString();
    }


}
