package utils;

import com.example.types.Data;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;


@Stateless
public class ProgrammaticTimer {

    @Inject
    private RestClientMir restClient;

    @Inject
    private JPAUtility jpaUtility;

    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void shedule() {
        Data jsonEmployee = new RestClientMir().getJsonEmployee();
        System.out.println(jsonEmployee.getBatteryPercentage());
       // jpaUtility.saveMovie(jsonEmployee.getBatteryPercentage(), Utils.generateIdFromDate(LocalDateTime.now()));
    }
}




//    @PostConstruct
//    public void init() {
//        for(int i = 0; i < 500; i++) {
//            Data data = restClient.getJsonEmployee();
//            System.out.println(data.getBatteryPercentage());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//}





