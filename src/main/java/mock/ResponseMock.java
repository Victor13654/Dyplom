package mock;

import dto.Data;
import dto.Velocity;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/mir")
public class ResponseMock {

    @GET
    @Produces("application/json")
    public Response returnJson(){
        Data data = new Data();
        Velocity velocity = new Velocity();
        data.setBatteryPercentage(10.0);
        data.setRobotModel("MIR");
        velocity.setLinear(10.0);
        data.setVelocity(velocity);
        data.setBatteryTimeRemaining(90);
        data.setDistanceToNextTarget(40.0);
        return Response.status(200).entity(data).build();
    }
}
