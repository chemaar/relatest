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
import es.uc3m.dps.testtwiter.TweetTO;



@Path("/search")
public class TwitterSearchService {
//https://blog.codecentric.de/en/2012/05/writing-lightweight-rest-integration-tests-with-the-jersey-test-framework/
	TweetDAO dao = new NaiveTweetDAOImpl();
	public TwitterSearchService(){

	}
	public TwitterSearchService(TweetDAO dao){
		 this.dao = dao;
		}
	@GET
	@ProduceMime({"text/plain", "application/xml", "application/json"})
	public ListTweetTO tweets(@QueryParam("query") String queryStr){
		try {
			System.out.println("Request for: "+queryStr);
			return new ListTweetTO(this.dao.search(queryStr));
		} catch (TwitterException e) {
			 throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		
	}
}
