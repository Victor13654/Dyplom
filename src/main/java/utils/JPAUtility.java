package utils;

import database.Data;

import javax.annotation.ManagedBean;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Stateless
public class JPAUtility {

    /*@PersistenceContext
    EntityManager entityManager;*/

    public void saveMovie() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Data data = new Data();
        data.setId(455L);

        entityManager.persist(data);
        entityManager.getTransaction().commit();
    }
}