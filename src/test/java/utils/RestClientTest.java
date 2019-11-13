package utils;

import dto.Data;
import org.junit.Test;
import restServices.RestClientMir;

public class RestClientTest {


    @Test
    public void getJsonEmployee1() {
        RestClientMir restClient = new RestClientMir();
        Data data = restClient.getJsonEmployee();
        System.out.println(restClient.getJsonEmployee().getBatteryPercentage());
        //restClient.getJsonEmployee();
    }
}