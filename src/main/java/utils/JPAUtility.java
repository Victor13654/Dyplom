package utils;


import dto.Data;
import dto.Velocity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;


@Stateless(name = "JPAUtility")
public class JPAUtility {


    public void saveMovie(Data data, String id) {
        EntityManager entityManager = createEntityManager();
        database.Data dataDb = fillData(data, id);
        entityManager.persist(dataDb);
        entityManager.getTransaction().commit();
    }

    public List<database.Data> allEntities() {
        EntityManager entityManager = createEntityManager();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<database.Data> cq = cb.createQuery(database.Data.class);
        Root<database.Data> rootEntry = cq.from(database.Data.class);
        CriteriaQuery<database.Data> all = cq.select(rootEntry);
        TypedQuery<database.Data> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    private EntityManager createEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }

    private database.Data fillData(Data data, String id) {
        database.Data dataEntity = new database.Data();
        dataEntity.setId(id);
        dataEntity.setBatteryPercentage(data.getBatteryPercentage());
        dataEntity.setRobotModel(data.getRobotModel());
        dataEntity.setLinearVelocity(Optional.ofNullable(data.getVelocity())
                .map(Velocity::getLinear).orElse(0.0));
        dataEntity.setBatteryTimeRemaining(data.getBatteryTimeRemaining());
        dataEntity.setDistanceToNextTarget(data.getDistanceToNextTarget());

        return dataEntity;
    }
}