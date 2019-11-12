/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Customer;


/**
 *
 * @author aluno
 */
public class CustomerRepository {
    
    public void save(Customer customer){
        customer.setName(":parametro");
        customer.setId("");
        customer.setAdress("");
        customer.setCpf("");

        
        
    }
}
