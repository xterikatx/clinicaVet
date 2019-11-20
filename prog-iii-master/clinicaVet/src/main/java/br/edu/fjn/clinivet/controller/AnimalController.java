package br.edu.fjn.clinivet.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.clinivet.model.customer.Animal;
import br.edu.fjn.clinivet.repository.AnimalRepository;
import javax.inject.Inject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erika
 */

@Controller
public class AnimalController {
    
@Inject
private Result result;


@Get("newAnimal")
public void newAnimal(){

}
@Post("newAnimal")
public void newAnimal(Animal animal){
    AnimalRepository.save(animal);
    //criar jsp listAnimal
//    result.redirectTo(this).listAnimal();
}

@Post("updateAnimal")
public void editAnimal(Animal animal){
    AnimalRepository.update(animal);
    //result.redirectTo(this).listAnimal();
}

@Get("list{id}")
public void listById(String cod){
    AnimalRepository.findById(cod);
    //result.redirectTo(this).findAnimal();
}

@Get("list{name}")
public void listByName(String name){
    AnimalRepository.findByName(name);
    //result.redirectTo(this).findAnimal();
}
}
