package dk.summerhouse.jee8.web.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("summerhouse")
public class SummerHouseResource {

    @GET
    public String hello() {
        return "hello";
    }
}
