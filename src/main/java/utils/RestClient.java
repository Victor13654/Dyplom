package utils;

import com.example.types.Data;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class RestClient {


    public Data getJsonEmployee() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/dyp-1.0-SNAPSHOT/mir");
        return webTarget.request(MediaType.APPLICATION_JSON).get(Data.class);
    }
}