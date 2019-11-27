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

import br.edu.fjn.clinivet.view.components.UserSession;
import javax.inject.Inject;


/**
 *
 * @author vinicius
 */
@Controller
@Path("auth")
public class AuthController {

    @Inject
    private UserSession userSession;
    @Inject
    private Result result;

    @Get("signin")
    public void login() {

    }

    @Post("authenticate")
    public void signin(String cpf, String password) {
        
        Customer a = CustomerRepository.findByCpfandPassword(cpf, password);
        if (a!=null) {
            System.out.println("pp" + a);
            userSession.setCpf(cpf);
            result.redirectTo(IndexController.class).index();
        }else{
           
        result.redirectTo(AuthController.class).login();
        
        }
System.out.println("pp" + a);        
    }

     @Get("signout")
    public void signout() {
        userSession.logout();
        result.redirectTo(this).login();
    }

}
