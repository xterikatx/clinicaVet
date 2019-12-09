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
import br.edu.fjn.clinivet.repository.QueryRepository;
import java.util.List;
import javax.inject.Inject;
import javax.swing.JOptionPane;

/**
 * @author vinicius
 */
@Private
@Controller
@Path("query")
public class QueryController {

    @Inject
    private Result result;

    //controlador que salva uma nova consulta
    @Post("newQuery")
    public void customerQuery(Query query) {
        //chamando método save do repositorio
        QueryRepository.save(query);
        System.out.println("QUERY" + query.getCreatedAt());
        //enviar uma msg para dizer q salvou
        result.include("msg", "Consulta agendada com sucesso! Entraremos em contato!");
        //redirecionando para a page customerQuery
        result.redirectTo(QueryController.class).customerQuery();
    }

    //chamando a página (somente)
    @Get("query")
    public void customerQuery() {
    }

    //controlador que faz a chamada da lista de consultas
    @Get("listQuery")
    public void query() {

        QueryRepository queryrepository = new QueryRepository();
        //definindo uma "lista de arrays" e chamando método do repositorio "listAll".
        List<Query> querys = QueryRepository.listAll();
        //   System.out.println("AQUIIIIII" + QueryRepository.listAll());
        //incluindo na tabela o retorno da lista de consulta.
        result.include("querys", querys);
    }

   @Get("remove/{id}")
    public void remove(Integer id) {
        //instanciando o query repositorio, como se fosse uma variavel
        QueryRepository queryrepository = new QueryRepository();
        //if(){
         int Answer = JOptionPane.showConfirmDialog(null,"Deseja remover a consulta ?","Exclusão",JOptionPane.YES_NO_OPTION);
         if (Answer==JOptionPane.YES_OPTION){
             //chamando o metodo deletebyid no repositorio
             queryrepository.DeletebyId(id);
             result.redirectTo(this).query();
         }
         if (Answer==JOptionPane.NO_OPTION){
             //redicionando para a página query
             result.redirectTo(this).query();
         }
    }

    //controlador que faz a busca por nome
    @Post("search")
    public void find(Query query) {
        //instanciando QueryRepository....
        QueryRepository queryRepository = new QueryRepository();
        //definindo uma "lista de arrays" e chamando método do repositorio "listAll".
        List<Query> querys = queryRepository.FindForIlike(query.getName());
        
        //colocando na página o retorno dos dados.
        result.include("querys", querys);
        //redicionando para a pagina query
        result.of(this).query();
    }
    
    //chamando a pagina Update (somente)
    @Get("update")
    public void update() {
    }
    
    //controlador que faz o update de consulta
    @Post("update")
    public void update(Query query) {
        //instanciando QueryRepository
        QueryRepository queryRepository = new QueryRepository();

        //se o resultado do id for diferente de nulo
        //entao pega os dados anteriores, e une com os atuais.
        //com getters and setters
        if (queryRepository.findById(query.getId()) != null) {
            Query q = queryRepository.findById(query.getId());

            if (query.getCpf() != null) {
                q.setCpf(query.getCpf());
            }

            if (query.getName() != null) {
                q.setName(query.getName());
            }

            if (query.getPhone() != null) {
                q.setPhone(query.getPhone());
            }
            
            //chamando o metodo update do repositorio
            //enviando como parametro o objeto "q" definido na linha 105
            queryRepository.update(q);
            //redirecionando para a pagina query
            result.redirectTo(this).query();
            //caso o id da query seja null então, envia uma msg informando..
        } else {
            result.include("msg", "Não existe uma consulta com esse id!");
            //redirecionando para a pagina de customerQuery.
            result.redirectTo(this).customerQuery();
        }

    }

    /*  @Post("update/{id}")
    public void update(Query query) {
        QueryRepository queryRepository = new QueryRepository();
        query.setName(query.getName());
        query.setCpf(query.getCpf());
        query.setPhone(query.getPhone());
        queryRepository.update(query);
        result.redirectTo(this).query();

    }*/
}
