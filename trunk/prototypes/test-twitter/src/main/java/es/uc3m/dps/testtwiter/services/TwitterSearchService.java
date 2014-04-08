package es.uc3m.dps.testtwiter.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;



@Path("/search")
public class TwitterSearchService {

	@GET
	@ProduceMime({"text/plain", "application/xml", "application/json"})
	public String hello(){
		return "hola";
		
	}
}
