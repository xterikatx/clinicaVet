/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

/**
 *
 * @author erika
 */
@Controller
public class LoginRepository {
    private Result result;
    
    @Get("login")
    public void verify(String cpf, String password){
           CustomerRepository.findByCpf(cpf);
           CustomerRepository.findPassword(password);
           
           
    }
}
