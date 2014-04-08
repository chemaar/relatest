package es.uc3m.dps.testtwiter;

import javax.ws.rs.QueryParam;

import twitter4j.TwitterException;

public class TweetService {
	TweetDAO dao = new NaiveTweetDAOImpl();
	public TweetService(){

	}
	public TweetService(TweetDAO dao){
		 this.dao = dao;
		}
	public ListTweetTO search(String queryStr) throws TwitterException{
		return new ListTweetTO(this.dao.search(queryStr));
	}
}
