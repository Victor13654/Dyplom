package utils;

import org.junit.Test;


public class JPAUtilityTest {

    @Test
    public void getEntityManager() {
        JPAUtility jpaUtility = new JPAUtility();
        jpaUtility.saveMovie();
        System.out.println("Huj");
    }
}