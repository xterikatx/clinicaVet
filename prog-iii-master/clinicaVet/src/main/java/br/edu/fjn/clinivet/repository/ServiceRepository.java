/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.model.service.Services;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.service.Service;

/**
 *
 * @author vinicius
 */
public class ServiceRepository {
        public static void save(Services service) {

        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.persist(service);
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

    public static void update(Services service) {
        EntityManager manager = ConnectionFactory.getManager();
        try {
            manager.getTransaction().begin();
            manager.merge(service);
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
    public static Services findById(String id){
        EntityManager manager = ConnectionFactory.getManager();
        Services service = manager.find(Services.class, id);
        return service;
    }
    
    public static List<Services> findByName(String type){
        EntityManager manager = ConnectionFactory.getManager();
        List<Services> service = manager.createQuery("select s from service s where s.type=:type").setParameter("type",type).getResultList();
        manager.close();
        return service;
   }
         public void DeletebyId(String Id){
         EntityManager manager = ConnectionFactory.getManager();
         manager.getTransaction().begin();
         Services services = findById(Id);
         
         try {
             manager.remove(manager.getReference(Services.class,services.getId()));
             manager.getTransaction().commit();
             
             
         } catch (Exception e) {
             if (manager.getTransaction().isActive()){
                 manager.getTransaction().rollback();
             }
         }finally{
             manager.close();
        }
     }

}
