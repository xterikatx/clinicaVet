/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.customer.Animal;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class AnimalRepository {

    public static void save(Animal animal){
        EntityManager manager = ConnectionFactory.getManager();
        try {
         manager.getTransaction();
         manager.persist(animal);
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

    public static void update(Animal animal){
        EntityManager manager = ConnectionFactory.getManager();
        try {
          manager.getTransaction();
          manager.merge(animal);
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
    public static Animal findById(String cod){
        EntityManager manager = ConnectionFactory.getManager();
        Animal animal = manager.find(Animal.class, cod);
        return animal;
    }
    public static List<Animal> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Animal> animals = manager.createQuery("select a from animal a where a.nome=:name")
                .setParameter("name", name).getResultList();
        return animals;
    } 
     public void DeletebyCod(String cod){
         EntityManager manager = ConnectionFactory.getManager();
         manager.getTransaction().begin();
         Animal animal = findById(cod);
         
         try {
             manager.remove(manager.getReference(Animal.class,animal.getCod()));
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
