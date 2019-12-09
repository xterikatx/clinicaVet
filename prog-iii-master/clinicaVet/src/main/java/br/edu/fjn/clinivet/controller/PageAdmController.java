/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.controller;


import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.clinivet.annotations.Private;
import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.repository.EmployeeRepository;
import java.util.List;
import javax.inject.Inject;


/**
 *
 * @author vinicius
 */
@Controller
@Private
public class PageAdmController {
    
    @Inject
   private Result result;   
    
    //método que chama a página de adm
    @Get("page")
    public void pageAdm(){
     
    }
    @Get("profile")
    public void admProfile(){
        
    }

    //controlador que faz a chamada da lista de consultas
    @Get("listEmployee")
    public void listEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        //definindo uma "lista de arrays" e chamando método do repositorio "listAll".
        List<Employee> employee = EmployeeRepository.listAll();
        //   System.out.println("AQUIIIIII" + QueryRepository.listAll());
        //incluindo na tabela o retorno da lista de consulta.
        result.include("employee", employee);
    }
}
