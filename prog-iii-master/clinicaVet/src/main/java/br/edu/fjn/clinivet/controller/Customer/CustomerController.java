/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.controller.Customer;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.clinivet.annotations.Private;
import br.edu.fjn.clinivet.model.customer.Customer;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author erika
 */
//Declarando que essa classe é um Controller
@Controller
public class CustomerController {

    //lembra do que leo falou? "Não sei".
    @Inject
    private Result result;

    //declarando metodo Get("rota")
    //metodo void que deve ter o mesmo nome do jsp
    @Get("newCustomer")
    public void formCustomer() {

    }

    //declarando metodo Post ("rota")
    //metodo void que deve ter o mesmo nome do jsp
    @Post("saveCustomer")
    public void save(Customer customer) {
        /*System.out.println("Customer " + customer.getAddress().getCity());
        result.include("msgSuccess", "Feito! "
                + customer.getName() + " salvo com sucesso!");
        result.redirectTo(this).formView();*/
    }
}
