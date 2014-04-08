package es.uc3m.dps.testtwiter.services;

import javax.ws.rs.core.Response;

import twitter4j.TwitterException;

public class NotFoundMapper {

	 public Response toResponse(TwitterException e) {
	        return Response.status(Response.Status.NOT_FOUND)
	                   .entity("todo-not-found").build();
	    }
}
