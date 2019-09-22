package application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The HealthEndpoint class returns the status of the service. It contains the HTTP status 
 * that defines whether the service is "Up" or "Down".
 */
@Path("health")
public class HealthEndpoint {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response healthcheck() {
      return Response.ok("{\"status\":\"UP\"}").build();
    }
}
