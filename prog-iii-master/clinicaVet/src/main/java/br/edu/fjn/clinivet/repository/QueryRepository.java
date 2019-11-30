/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.query.Query;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author vinicius
 */
public class QueryRepository {
    
    public static void save(Query query){
        EntityManager manager = ConnectionFactory.getManager();
        try {
         manager.getTransaction().begin();
         manager.persist(query);
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

    public static void update(Query query){
        EntityManager manager = ConnectionFactory.getManager();
        try {
          manager.getTransaction();
          manager.merge(query);
          manager.getTransaction().commit();
        } catch (Exception e) {


             if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
        }

    }
    public static Query findById(String cod){
        EntityManager manager = ConnectionFactory.getManager();
        Query query = manager.find(Query.class, cod);
        return query;
    }
    public static List<Query> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Query> query = manager.createQuery("select a from query a where a.nome=:name")
                .setParameter("name", name).getResultList();
        return query;
    } 

}
