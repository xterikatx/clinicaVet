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
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.POST;

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
    public void customerQuery(Query query) {
        QueryRepository.save(query);
        System.out.println("QUERY" + query.getCreatedAt());
        result.include("msg", "Consulta agendada com sucesso! Entraremos em contato!");
       result.redirectTo(QueryController.class).customerQuery();
    }
    
    @Get("query")
    public void customerQuery() {
    }

    @Get("listQuery")
    public void query() {
        QueryRepository queryrepository = new QueryRepository();
        List<Query> querys = QueryRepository.listAll();
        System.out.println("AQUIIIIII" + QueryRepository.listAll());
        result.include("querys", querys);
    }
    
    @Get("remove/{id}")
    public void remove (String id){
         QueryRepository queryrepository = new QueryRepository();
        queryrepository.DeletebyId(id);
        result.redirectTo(this).query();
    }
    @Post("search")
    public void find(Query query){
        QueryRepository queryRepository = new QueryRepository();
        List<Query> querys = queryRepository.FindForIlike(query.getName());
        result.include("querys", querys);
        result.of(this).query();
    }
    @Post("update")
    public void update(Query query){
        QueryRepository queryRepository = new QueryRepository();
        query.setName(query.getName());
        query.setCpf(query.getCpf());
        query.setPhone(query.getPhone());
        queryRepository.update(query);
        result.redirectTo(this).query();
        
    }
}
