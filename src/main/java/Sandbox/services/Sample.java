package Sandbox.services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/sample")
public class Sample {
    @GET
    @Produces("text/plain")
    public String reply() {
        return "Hola";
    }
}
