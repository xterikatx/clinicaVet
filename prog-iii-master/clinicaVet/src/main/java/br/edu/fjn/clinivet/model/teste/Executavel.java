/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.teste;

import br.edu.fjn.clinivet.model.customer.Animal;
import br.edu.fjn.clinivet.repository.AnimalRepository;
import br.edu.fjn.clinivet.repository.CustomerRepository;

/**
 *
 * @author erika
 */
public class Executavel {
    
    public static void main(String[] arg) {
        AnimalRepository animalRepository
                = new AnimalRepository();
        CustomerRepository customerRepository
                = new CustomerRepository();
   
        Animal animal = new Animal();
        animal.gerarCod();
        animal.setName("Marley");
        animal.setType("Cachorro");
        animal.setBreed("Médio");
        animal.setPostage("Pitbull");
        
        animalRepository.save(animal);
        
    
    }
    

}
