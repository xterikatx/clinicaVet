/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.model.vet.Vet;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class VetRepository {

    public static void save(Vet vet) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.persist(vet);
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

    public static void update(Vet vet) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.merge(vet);
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

    public static Vet findById(String id) {
        EntityManager manager = ConnectionFactory.getManager();
        Vet vet = manager.find(Vet.class, id);
        return vet;
    }
        public static List<Vet> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Vet> vet = manager.createQuery("select c from customer c where c.name= :name ")
                .setParameter("name", name).getResultList();
        manager.close();
        return vet;  
    }
    public static Vet findPassword(String password){
        EntityManager manager = ConnectionFactory.getManager();
        Vet vet = (Vet) manager.createQuery("select c from customer c where c.password=:password").setParameter("password",password).getSingleResult();
        manager.close();
        return vet;
    }
}
