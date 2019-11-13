package utils;

import database.Data;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Stateless(name = "JPAUtility")
public class JPAUtility {


    public void saveMovie(Double percentage, String id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Data data = new Data();
        data.setBatteryPercentage(percentage);
        data.setId(id);

        entityManager.persist(data);
        entityManager.getTransaction().commit();
    }
}