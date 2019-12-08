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

    //controlador que salva um novo funcionário
    @Post("newEmployee")
    public void newEmployee(Employee employee) {
        //chamando método save do repositorio
        EmployeeRepository.save(employee);
        //redirecionando para o login (p fazer o login, obvio)
        result.redirectTo(AuthController.class).login();
    }

    //controlador que atualiza um dado do funcionário
    @Post("updateEmployee")
    public void editCustomer(Employee employee) {
        EmployeeRepository.update(employee);
        //result.redirectTo(this).listCustomer();
    }

   
    
}
