/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class EmployeeRepository {
    
    public static void save(Employee employee) {

        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.persist(employee);
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

    public static void update(Employee employee) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.merge(employee);
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
    public static Employee findById(String id){
        EntityManager manager = ConnectionFactory.getManager();
        Employee employee = manager.find(Employee.class, id);
        return employee;
    }
    
    public static List<Employee> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Employee> employee = manager.createQuery("select e from employee e where e.name=:name").setParameter("name",name).getResultList();
        manager.close();
        return employee;
   }

     public static Employee findPassword(String password){
        EntityManager manager = ConnectionFactory.getManager();
        Employee employee = (Employee) manager.createQuery("select c from customer c where c.password=:password").setParameter("password",password).getSingleResult();
        manager.close();
        return employee;
    }
}
