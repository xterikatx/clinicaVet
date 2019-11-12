/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author erika
 */
public class ConnectionFactory {
     private static final EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("veterinaria");

    public static EntityManager obterGerenciador() {
        return factory.createEntityManager();
    }
    
    /**
     * Fechar conexão
     */
    public static void closeUp(){
        factory.close();
    }
}
