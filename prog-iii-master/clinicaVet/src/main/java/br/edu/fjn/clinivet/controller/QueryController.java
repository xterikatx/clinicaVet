/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Get;

import br.com.caelum.vraptor.Result;

import br.edu.fjn.clinivet.annotations.Private;
import br.edu.fjn.clinivet.model.query.Query;
import br.edu.fjn.clinivet.repository.EmployeeRepository;
import br.edu.fjn.clinivet.repository.QueryRepository;
import javax.inject.Inject;

/**
 *
 * @author vinicius
 */
@Private
@Controller
@Path("query")
public class QueryController {

    @Inject
    private Result result;

    @Post("newQuery")
    public void newQuery(Query query) {
        QueryRepository.save(query);
        System.out.println("QUERY" + query.getCreatedAt());
        result.include("msg", "Consulta agendada com sucesso! Entraremos em contato!");

        result.redirectTo(AuthController.class).customerQuery();
    }

    @Get("listQuery")
    public void query() {

    }

    @Get("list")
    public void listById(String id) {
        EmployeeRepository.findById(id);
        result.redirectTo(this).query();
    }

}
