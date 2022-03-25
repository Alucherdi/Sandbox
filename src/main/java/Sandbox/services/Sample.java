package Sandbox.services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/sample")
public class Sample {
    @GET
    @Produces("text/plain")
    public String reply(
        @QueryParam("a") int a,
        @QueryParam("b") int b
    ) {
        return Integer.toString(a + b);
    }
}
