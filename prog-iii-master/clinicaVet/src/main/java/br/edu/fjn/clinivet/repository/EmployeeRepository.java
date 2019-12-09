/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.repository;

import br.edu.fjn.clinivet.model.employee.Employee;
import br.edu.fjn.clinivet.repository.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author aluno
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
    
    //listando todos os dados
    public static List<Employee> listAll() { //lista - ARRAY...
        //chamando conexão
        EntityManager manager = ConnectionFactory.getManager();
        //método que serve pra fazer busca no banco através de objetos.
        Session session = (Session) manager.getDelegate();
        //dentro do session surge uma criteria. 
        //a criteria faz busca em uma determinada class.
        //-> Query.class.
        //É necessário uma session para ter uma criteria.
        Criteria criteria = session.createCriteria(Employee.class);
        //declarando um array, e colocando dentro dele, tudo que a criteria
        //achou na classe Query.
        List<Employee> employee = criteria.list();
        //fechando conexão
        manager.close();
        //retornando a lista...
        return employee;
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

    public static Employee findByCpf(String cpf){
        EntityManager manager = ConnectionFactory.getManager();
        Employee employee = manager.find(Employee.class, cpf);
        return employee;        
    }
        public static List<Employee> CustomerList(){
        EntityManager manager = ConnectionFactory.getManager();
        Session session = (Session) manager.getDelegate();
        Criteria criteria = session.createCriteria(Employee.class);
        List<Employee> employee = criteria.
                setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .list();
        manager.close();
        return employee;  
    }

   public static List<Employee> findByName(String name){
        EntityManager manager = ConnectionFactory.getManager();
        List<Employee> employee = manager.createQuery("select e from employee e where e.name=:name ")
                .setParameter("name", name).getResultList();
        return employee;  
    }
   /* public static Employee findPassword(String password){
        EntityManager manager = ConnectionFactory.getManager();
        Employee employee = (Employee) manager.createQuery("select c from customer c where c.password=:password").setParameter("password",password).getSingleResult();
        manager.close();
        return employee;
    }*/
     public static Employee findByCpfandPassword(String cpf, String password) {
        EntityManager manager= ConnectionFactory.getManager();
        Employee a = null;
        try {
            a = manager.createQuery(
                    "select a from Employee a where a.cpf = :cpf "
                    + "AND a.password = :password", Employee.class)
                    .setParameter("cpf", cpf)
                    .setParameter("password", password)
                    .getSingleResult();
           
        } catch (NoResultException e) {
            a = null;
        }
        
        return a;
        
    }
     public static void DeletebyId(String Id){
         EntityManager manager = ConnectionFactory.getManager();
         manager.getTransaction().begin();
         Employee employee = findById(Id);
         
         try {
             manager.remove(manager.getReference(Employee.class,employee.getId()));
             manager.getTransaction().commit();
             
             
         } catch (Exception e) {
             if (manager.getTransaction().isActive()){
                 manager.getTransaction().rollback();
             }
         }finally{
             manager.close();
        }
     }
  //metodo de buscar
    public List<Employee> FindForIlike(String name) {
        EntityManager manager = ConnectionFactory.getManager();
        //método que serve pra fazer busca no banco através de objetos.
        Session session = (Session) manager.
                getDelegate();
        Criteria c = session.createCriteria(Employee.class);
        
        //tratamento de erro para caso o nome seja "null"
        if (name == null) {
            name = "";
        }
        
        //criando restrição, nela, vai passar o que é obrigado usar o método
        //ilike para fazer a pesquisa. matchMode: orderBy
        c.add(Restrictions.
                ilike("name", name,
                        MatchMode.ANYWHERE));
        List<Employee> employee = c.list();
        manager.close();
        return employee;
    }
   
}