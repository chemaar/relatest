package es.uc3m.dps.testtwiter;

import java.util.LinkedList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TweetDAOImpl implements TweetDAO {
//	protected static Logger logger = Logger.getLogger(TweetDAOImpl.class);
	
	public List<String> search(String queryStr) throws TwitterException {
		  List<String> tweets =  new LinkedList<String>();
		  Twitter twitter = TwitterFactory.getSingleton();
		  Query query = new Query(queryStr);
		  QueryResult result = twitter.search(query);
		    for (Status status : result.getTweets()) {
		    	tweets.add(status.getText());
		    }
		    return tweets;
	}

	
}
