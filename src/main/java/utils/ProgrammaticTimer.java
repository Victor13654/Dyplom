package utils;

import dto.Data;
import restServices.RestClientMir;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.time.LocalDateTime;


@Stateless
public class ProgrammaticTimer {


    @Inject
    private JPAUtility jpaUtility;

    @Schedule(second = "*/20", minute = "*", hour = "*")
    public void shedule() {
        Data data = new RestClientMir().getJsonEmployee();
        jpaUtility.saveMovie(data, Utils.generateIdFromDate(LocalDateTime.now()));
    }

    public Data getCurrentState() {
        return new RestClientMir().getJsonEmployee();
    }
}






