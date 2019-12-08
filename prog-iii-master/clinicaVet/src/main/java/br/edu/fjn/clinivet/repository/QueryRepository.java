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

    @Inject
    private Result result;

    public static void save(Query query) {
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

    public static List<Query> listAll() {
        EntityManager manager = ConnectionFactory.getManager();
        Session session = (Session) manager.getDelegate();
        Criteria criteria = session.createCriteria(Query.class);
        List<Query> querys = criteria.list();
        manager.close();
        return querys;
    }

    public static void update(Query query) {
        EntityManager manager = ConnectionFactory.getManager();
        manager.getTransaction().begin();

        try {
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

    public static Query findById(Integer id) {
        EntityManager manager = ConnectionFactory.getManager();
        Query query = manager.find(Query.class, id);
        return query;
    }

    public static List<Query> findByName(String name) {
        EntityManager manager = ConnectionFactory.getManager();
        List<Query> query = manager.createQuery("select a from query a where a.nome=:name")
                .setParameter("name", name).getResultList();
        return query;
    }

    public void DeletebyId(Integer id) {
        EntityManager manager = ConnectionFactory.getManager();
        manager.getTransaction().begin();
        Query query = findById(id);

        try {
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

    public List<Query> FindForIlike(String name) {
        EntityManager manager = ConnectionFactory.getManager();
        Session session = (Session) manager.
                getDelegate();
        Criteria c = session.createCriteria(Query.class);
        if (name == null) {
            name = "";
        }
        c.add(Restrictions.
                ilike("name", name,
                        MatchMode.ANYWHERE));
        List<Query> querys = c.list();
        manager.close();
        return querys;
    }

}
