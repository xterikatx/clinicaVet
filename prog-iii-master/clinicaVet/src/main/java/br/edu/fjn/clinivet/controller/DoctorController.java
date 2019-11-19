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
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author erika
 */
@Controller

public class DoctorController {

    @Inject
    private Result result;

//Inject
//BANCO - medico
//private Vet.vet;
    
    
    
    @Get("new")
    //deixei com outro nome por enquanto, o certo é newDoctor
    public void newD() {

    }
    
    
    @Post("new")
//OBS, enviar o objeto: Doctor doctor nos parametros do metodo
    public void newDoctor() {

        /**
         * CHAMANDO MEDOTO SAVE (ONDE FICA OS METODOS QUE VAO ENVIAR PRO BANCO
         * DEPOIS REDIRECIONA PARA ALGUMA PAGINA, ex: listDoctor.jsp
         */
        //doctorDAO.save(doctor);
        //result.redirectTo(this).listDoctor();
    }

//OBS, enviar o objeto: Doctor doctor nos parametros do metodo
    @Post("update")
    public void updateDoctor() {
        /**
         * CHAMANDO MEDOTO UPDATE (ONDE FICA OS METODOS QUE VAO ENVIAR PRO BANCO
         * DEPOIS REDIRECIONA PARA ALGUMA PAGINA, ex: listDoctor.jsp
         */

        //doctorDAO.update(doctor);
        //result.redirectTo(this).listDoctor();
    }

//OBS, enviar o objeto: String CRM nos parametros do metodo
//editar por id
    @Get("update/{CRM}")
    public void updateDoctor(String CRM) {
        // Doctor doctor = doctorDAO.findById(CRM);
        //result.include("doctor", doctor);
    }

    //metodo remover por id 
    @Get("remove/{CRM}")
    public void removeDoctor(String CRM) {
        //Doctor doctor = doctorDAO.findById(CRM);
        //result.include("doctor", doctor);
        //doctorDAO.remove(id);
        //result.redirectTo(this).listDoctor();
    }

    //metodo listar
    //o for serve pra verificar o tamanho de "arrays" do banco, 
    //e listar somente por nome de medico.
    @Get("lista")
    public void listDoctor() {
        /*     List<Doctor> doctor = doctorDAO.findAll();
        for (Doctor doctor1 : doctor) {
            System.out.println(doctor1.getName());
        }
        result.include("it", doctor);*/
    }

}
