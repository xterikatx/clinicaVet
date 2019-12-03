/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.teste;
import br.edu.fjn.clinivet.repository.CustomerRepository;
import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.repository.EmployeeRepository;
/**
 *
 * @author erika
 */
public class Executavel {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(""+CustomerRepository.CustomerList());
        
       /* Employee employee = new Employee();
        employee.setCpf(984234234);
        employee.setName("vinicius");
        employee.setPassword(123);
        EmployeeRepository.save(employee);*/
        

        //System.out.println("cliente:"+CustomerRepository.findByName("Vinicius"));
       /* CustomerRepository.DeletebyId("1");
        System.out.println("Usuario deletado:"+customer.getId());
		customerrepository.setName("Vitor");;
		customerrepository.setCpf("46465651236");
                customerrepository.setAddress("Rua vidal");
                customerrepository.setPassword("123");
                customerrepository.setId("1");
		CustomerRepository.save(customerrepository);
		
        Customer a = CustomerRepository.findByCpfandPassword("46465651236", "123");

        if (a != null) {
            System.out.println(a.getCpf()+ " realizou login!");
        } else {
            System.out.println("Acesso não autorizado!");

        }*/
                
    }
}
