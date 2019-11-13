package utils;

import com.example.types.Data;
import org.junit.Test;

public class RestClientTest {


    @Test
    public void getJsonEmployee1() {
        RestClientMir restClient = new RestClientMir();
        Data data = restClient.getJsonEmployee();
        System.out.println(restClient.getJsonEmployee().getBatteryPercentage());
        //restClient.getJsonEmployee();
    }
}