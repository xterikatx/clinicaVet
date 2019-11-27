/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.teste;
import br.edu.fjn.clinivet.repository.CustomerRepository;
import br.edu.fjn.clinivet.model.customer.Customer;
/**
 *
 * @author erika
 */
public class Executavel {
    public static void main(String[] args) {

        Customer customerrepository = new Customer();
		/*customerrepository.setName("Vitor");;
		customerrepository.setCpf("46465651236");
                customerrepository.setAddress("Rua vidal");
                customerrepository.setPassword("123");
                customerrepository.setId("1");
		CustomerRepository.save(customerrepository);*/
		
        Customer a = CustomerRepository.findByCpfandPassword("46465651236", "123");

        if (a != null) {
            System.out.println(a.getCpf()+ " realizou login!");
        } else {
            System.out.println("Acesso não autorizado!");

        }
    }
}
