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
import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.repository.CustomerRepository;
import br.edu.fjn.clinivet.repository.EmployeeRepository;
import javax.inject.Inject;

/**
 *
 * @author erika
 */
@Controller
@Path("auth")
public class EmployeeController {

    @Inject
    private Result result;

    @Post("newEmployee")
    public void newEmployee(Employee employee) {
        EmployeeRepository.save(employee);
        result.redirectTo(AuthController.class).login();
    }

    @Post("updateEmployee")
    public void editCustomer(Employee employee) {
        EmployeeRepository.update(employee);
        //result.redirectTo(this).listCustomer();
    }

    @Get("list{id}")
    public void listById(String id) {
        CustomerRepository.findById(id);
        //result.redirectTo(this).findCustomer();
    }

    
}
