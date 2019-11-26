/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


/**
 *
 * @author aluno
 */
public class CustomerRepository {

    public static void save(Customer customer) {

        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.persist(customer);
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Verifica se a transação está ativa ainda.
            // Um erro pode encerrar a transação sem permitir
            // um rollback pelo programador.
            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
        }
    }

    public static void update(Customer customer) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.merge(customer);
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Verifica se a transação está ativa ainda.
            // Um erro pode encerrar a transação sem permitir
            // um rollback pelo programador.
            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
        }
    }
    public static Customer findById(String id){
        EntityManager manager = ConnectionFactory.getManager();
        Customer customer = manager.find(Customer.class, id);
        return customer;
    }

    public static Customer findByCpf(String cpf){
        EntityManager manager = ConnectionFactory.getManager();
        Customer customer = manager.find(Customer.class, cpf);
        return customer;        
    }

    public static List<Customer> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Customer> customer = manager.createQuery("select c from customer c where c.name= :name ")
                .setParameter("name", name).getResultList();
        manager.close();
        return customer;  
    }
    public static Customer findPassword(String password){
        EntityManager manager = ConnectionFactory.getManager();
        Customer customer = (Customer) manager.createQuery("select c from customer c where c.password=:password").setParameter("password",password).getSingleResult();
        manager.close();
        return customer;
    }
     public static Customer findByCpfandPassword(String cpf, String password) {
        EntityManager manager= ConnectionFactory.getManager();
        Customer a = null;
        try {
            a = manager.createQuery(
                    "select a from Customer a where a.cpf = :cpf "
                    + "AND a.password = :password", Customer.class)
                    .setParameter("cpf", cpf)
                    .setParameter("password", password)
                    .getSingleResult();
           
        } catch (NoResultException e) {
            a = null;
        }
        
        return a;
        
    }
   
  /* public static boolean validate(String cpf, String password) {
            CustomerRepository customerrepository =  new CustomerRepository();
            
            Customer a =  customerrepository.findByCpf(cpf)
       
       
           
        
        return false;
    }*/

   
}