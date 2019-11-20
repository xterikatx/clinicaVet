/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.teste;
import br.edu.fjn.clinivet.controller.CustomerController;
import br.edu.fjn.clinivet.repository.CustomerRepository;
import br.edu.fjn.clinivet.model.customer.Customer;
/**
 *
 * @author erika
 */
public class Executavel {
    public static void main(String[] args) {
        /*ClinicDAO clinicDao = new ClinicDAO();
		c.setName("Hamburgueria");
		c.setSpecialization("Pero");
		clinicDao.save(c);
		
		Doctor d = new Doctor();
		DoctorDAO doctorDao = new DoctorDAO();
		d.setName("Dezo Nesto");
		d.setAge(34);
		d.setRg("7128673186783");
		d.setCrm("37862671");
		doctorDao.save(d);*/
        
        CustomerRepository customer = new CustomerRepository();
    //    customer.setName("");
    }
}
