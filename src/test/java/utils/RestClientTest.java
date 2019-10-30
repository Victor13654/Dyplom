package utils;

import com.example.types.Data;
import org.junit.Test;

public class RestClientTest {


    @Test
    public void getJsonEmployee1() {
        Data data = new RestClient().getJsonEmployee();
        System.out.println(data.getBatteryPercentage());
    }
}