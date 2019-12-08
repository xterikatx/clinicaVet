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
import br.edu.fjn.clinivet.view.components.UserSession;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author vinicius
 */
@Controller
@Path("auth")
public class AuthController {
    //chamando construtor.
    @Inject
    private UserSession userSession;
    @Inject
    private Result result;

    @Get("signin")
    public void login() {
    }

    @Get("signup")
    public void signup() {

    }   
    
    //controlador chamandos as verificações de login. e dedirencionando
    //para as
    @Post("authenticate")
    public void signin(String cpf, String password) {
        //chamando método irá buscar o cpf e senha
        Employee a = EmployeeRepository.findByCpfandPassword(cpf, password);
        //se o objeto for diferente de nulo, é feito o login e redireciona para a página de adm
        //se não continue na página de login.
        if (a != null) {
            System.out.println("pp" + a);
            userSession.setCpf(cpf);
            result.redirectTo(PageAdmController.class).pageAdm();
        } else {
            result.redirectTo(AuthController.class).login();
        }
    }
    
    //controlador para deslogar
    @Get("signout")
    public void signout() {
        userSession.logout();
        result.redirectTo(this).login();
    }

}
