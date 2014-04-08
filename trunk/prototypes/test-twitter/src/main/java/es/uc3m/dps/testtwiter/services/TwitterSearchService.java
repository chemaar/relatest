package es.uc3m.dps.testtwiter.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ProduceMime;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import twitter4j.TwitterException;

import es.uc3m.dps.testtwiter.ListTweetTO;
import es.uc3m.dps.testtwiter.NaiveTweetDAOImpl;
import es.uc3m.dps.testtwiter.TweetDAO;
import es.uc3m.dps.testtwiter.TweetService;
import es.uc3m.dps.testtwiter.TweetTO;



@Path("/search")
public class TwitterSearchService {
//https://blog.codecentric.de/en/2012/05/writing-lightweight-rest-integration-tests-with-the-jersey-test-framework/
	TweetService service = new TweetService();
	public TwitterSearchService(){

	}

	@GET
	@ProduceMime({"text/plain", "application/xml", "application/json"})
	public ListTweetTO tweets(@QueryParam("query") String queryStr){
		try {
			return this.service.search(queryStr);
		} catch (TwitterException e) {
			 throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		
	}
}
