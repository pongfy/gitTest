package pra.pengfei.webservice.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello1")
@Produces("*/*")
public interface HelloWorld {

	@GET
	@Path("/service/{name}")
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	String service(@PathParam("name") String name);
}
