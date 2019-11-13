package mock;

import com.example.types.Data;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/mir")
public class ResponseMock {

    @GET
    @Produces("application/json")
    public Response returnJson(){
        Data data = new Data();
        data.setBatteryPercentage(10.0);
        data.setRobotModel("MIR");
        return Response.status(200).entity(data).build();
    }
}
