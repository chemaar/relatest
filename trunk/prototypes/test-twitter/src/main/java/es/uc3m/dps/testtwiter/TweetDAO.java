package es.uc3m.dps.testtwiter;

import java.util.List;

import twitter4j.TwitterException;

public interface TweetDAO {
	
	public List<TweetTO> search(String queryStr) throws TwitterException;

}
