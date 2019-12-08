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

/*DEFININDO A CONEXÃO COM O BANCO DE DADOS... */

public class ConnectionFactory {

    /*
        Estamos chamando o nome da persitencia lá no persistence.xml...
        Sem a persistencia definida com o nome e senha do banco corretos
        O banco não funciona...
        
        Estamos persistindo uma conexão chamada "factory".
     */
    private static final EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("petshop");

    /*
      O metodo getManager irá ser definido nos repositorios...
      Quando chamamos esse método estamos tentando chamar a conexão... 
      -> Definindo lá nos repositórios: EntityManager manager = ConnectionFactory.getManager();
    
     **/
    public static EntityManager getManager() {
        return factory.createEntityManager();
    }

    /**
     Quando chamos esse metódo, estamos fechando a conexão...
     */
    public static void closeUp() {
        factory.close();
    }
}
