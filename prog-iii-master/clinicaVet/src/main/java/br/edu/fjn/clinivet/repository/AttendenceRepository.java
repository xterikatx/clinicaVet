/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.attedence.Attendence;
import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author bruno
 */
public class AttendenceRepository {
    
     public static void save(Attendence attendence) {

        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.persist(attendence);
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

    public static void update(Attendence attendence) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.merge(attendence);
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
    public static Attendence findById(String id){
        EntityManager manager = ConnectionFactory.getManager();
        Attendence attendence = manager.find(Attendence.class, id);
        return attendence;
    }

    public static Attendence findByCpf(String cpf){
        EntityManager manager = ConnectionFactory.getManager();
        Attendence attendence = manager.find(Attendence.class, cpf);
        return attendence;        
    }

    public static List<Attendence> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Attendence> attendence = manager.createQuery("select c from customer c where c.name= :name ")
                .setParameter("name", name).getResultList();
        manager.close();
        return attendence;  
    }

}
