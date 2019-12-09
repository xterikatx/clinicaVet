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

import java.util.List;
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

   
    @Get("listEmployee")
    public void listEmployee() {

        EmployeeRepository employeerepository = new EmployeeRepository();
        //definindo uma "lista de arrays" e chamando método do repositorio "listAll".
        List<Employee> employees = EmployeeRepository.listAll();
        //   System.out.println("AQUIIIIII" + QueryRepository.listAll());
        //incluindo na tabela o retorno da lista de consulta.
        result.include("employees", employees);
    }
    
       //controlador que faz a busca por nome
    @Post("searchEmployee")
    public void find(Employee employee) {
        //instanciando QueryRepository....
        EmployeeRepository employeerepository = new EmployeeRepository();
        //definindo uma "lista de arrays" e chamando método do repositorio "listAll".
        List<Employee> employees = employeerepository.FindForIlike(employee.getName());
        
        //colocando na página o retorno dos dados.
        result.include("employees", employees);
        //redicionando para a pagina query
        result.of(this).listEmployee();
    }
}
