package mock;

import dto.Data;
import utils.JPAUtility;
import utils.ProgrammaticTimer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("")
public class MirStatusResponse {

    @Inject
    ProgrammaticTimer programmaticTimer;

    @Inject
    JPAUtility jpaUtility;

    @GET
    @Path("/getCurrentStatus")
    @Produces("application/json")
    public Data getCurrentState() {
        return programmaticTimer.getCurrentState();
    }

    @GET
    @Path("/getLogs")
    @Produces("application/json")
    public List<database.Data> getLogs() {
        return jpaUtility.allEntities();
    }
}
