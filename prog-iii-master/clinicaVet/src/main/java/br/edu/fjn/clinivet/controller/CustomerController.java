/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.repository.CustomerRepository;
import javax.inject.Inject;

/**
 *
 * @author erika
 */
@Controller
@Path("auth")
public class CustomerController {

    @Inject
    private Result result;
    
    @Post("newCustomer")
    public void newCustomer(Customer customer){
        
        CustomerRepository.save(customer);
  
        System.out.println("CUSTOMER " + customer.getName());
        result.redirectTo(AuthController.class).login();
    }

    @Post("updateCustomer")
    public void editCustomer(Customer customer) {
        CustomerRepository.update(customer);
        //result.redirectTo(this).listCustomer();
    }

    @Get("list{id}")
    public void listById(String id) {
        CustomerRepository.findById(id);
        //result.redirectTo(this).findCustomer();
    }

    @Get("list{name}")
    public void listByName(String name) {
        CustomerRepository.findByName(name);
        //result.redirectTo(this).findCustomer();
    }

    @Get("list{cpf}")
    public void listByCpf(String cpf) {
        CustomerRepository.findByCpf(cpf);
        //result.redirectTo(this).findCustomer();
    }
}
