/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.com.caelum.vraptor.Result;
import br.edu.fjn.clinivet.controller.QueryController;
import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.model.query.Query;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vinicius
 */
public class QueryRepository {

    public static void save(Query query) {
        //chamando conexão.
        EntityManager manager = ConnectionFactory.getManager();
        try {
            //inicia processo
            manager.getTransaction().begin();
            //pegando dados
            manager.persist(query);
            //enviando os dados
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
            //fechando a conexão.
            manager.close();
        }

    }

    //listando todos os dados
    public static List<Query> listAll() { //lista - ARRAY...
        //chamando conexão
        EntityManager manager = ConnectionFactory.getManager();
        //método que serve pra fazer busca no banco através de objetos.
        Session session = (Session) manager.getDelegate();
        //dentro do session surge uma criteria. 
        //a criteria faz busca em uma determinada class.
        //-> Query.class.
        //É necessário uma session para ter uma criteria.
        Criteria criteria = session.createCriteria(Query.class);
        //declarando um array, e colocando dentro dele, tudo que a criteria
        //achou na classe Query.
        List<Query> querys = criteria.list();
        //fechando conexão
        manager.close();
        //retornando a lista...
        return querys;
    }

    /*ATUALIZAR*/
    public static void update(Query query) {
        EntityManager manager = ConnectionFactory.getManager();

        try {
            manager.getTransaction().begin();
            //une tudo aquilo que já tem com uma nova transação
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

    /*ENCONTRAR POR ID.*/
    public static Query findById(Integer id) {
        EntityManager manager = ConnectionFactory.getManager();
        //buscando o id na classe Query.class.
        Query query = manager.find(Query.class, id);
        return query;
    }

    /*public static List<Query> findByName(String name) {
        EntityManager manager = ConnectionFactory.getManager();
        List<Query> query = manager.createQuery("select a from query a where a.nome=:name")
                .setParameter("name", name).getResultList();
        return query;
    }*/
    public void DeletebyId(Integer id) {
        EntityManager manager = ConnectionFactory.getManager();
        manager.getTransaction().begin();
        Query query = findById(id);

        try {
            //chamando a referencia da classe (parametros)
            //dentro do reference ele está definindo qual a classe, e 
            //chamando o metodo "findById" pra chamar o id.
            manager.remove(manager.getReference(Query.class, query.getId()));
            manager.getTransaction().commit();
        } catch (Exception e) {
            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
        } finally {
            manager.close();
        }
    }

    //metodo de buscar
    public List<Query> FindForIlike(String name) {
        EntityManager manager = ConnectionFactory.getManager();
        //método que serve pra fazer busca no banco através de objetos.
        Session session = (Session) manager.
                getDelegate();
        Criteria c = session.createCriteria(Query.class);
        
        //tratamento de erro para caso o nome seja "null"
        if (name == null) {
            name = "";
        }
        
        //criando restrição, nela, vai passar o que é obrigado usar o método
        //ilike para fazer a pesquisa. matchMode: orderBy
        c.add(Restrictions.
                ilike("name", name,
                        MatchMode.ANYWHERE));
        List<Query> querys = c.list();
        manager.close();
        return querys;
    }

}
