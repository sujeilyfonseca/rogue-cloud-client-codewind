package application.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * The JaxrsApplication is the main jersey configuration class. It resolves a nucleus 
 * atg.jaxrs.ApplicationService to provide the actual configuration.
 */
@ApplicationPath("/jaxrs")
public class JaxrsApplication extends Application {

}
