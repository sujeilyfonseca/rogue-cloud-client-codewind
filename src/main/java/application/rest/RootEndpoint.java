package application.rest;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


/**
 * The RootEndpoint class is the ‘homepage’ of the API. From this API call, the code should be able to reach all other API 
 * endpoints and all resources by simply following the hypertext links provided in each response.
 */
@Path("/")
public class RootEndpoint {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response listResources(@Context UriInfo uriInfo) {
    String healthURL = (uriInfo.getAbsolutePath() + "/health").replaceAll("(?<!http:)\\/\\/", "/");
    String exampleURL = (uriInfo.getAbsolutePath() + "/v1/example").replaceAll("(?<!http:)\\/\\/", "/");
    return Response.ok("{\"health\":\"" + healthURL + "\",\"example\":\"" + exampleURL + "\"}").build();
  }

  @GET
  @Produces({ MediaType.TEXT_HTML })
  public InputStream getIndex() {
    try {
      return this.getClass().getResourceAsStream("/index.html");
    } catch (Exception e) {
      throw new RuntimeException("Exception returning index.html", e);
    }
  }
}
