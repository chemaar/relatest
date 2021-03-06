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
	
	public List<TweetTO> search(String queryStr) throws TwitterException {
		if(queryStr==null || queryStr.equalsIgnoreCase("")){
			throw new TwitterException("Invalid query string");
		}
		  List<TweetTO> tweets =  new LinkedList<TweetTO>();
		  Twitter twitter = TwitterFactory.getSingleton();
		  Query query = new Query(queryStr);
		  QueryResult result = twitter.search(query);
		    for (Status status : result.getTweets()) {
		    	TweetTO myTweet = new TweetTO();
		    	myTweet.setId(""+status.getId());
		    	myTweet.setUserId(""+status.getUser().getId());
		    	myTweet.setText(status.getText());
		    	myTweet.setCreated(status.getCreatedAt());
		    	tweets.add(myTweet);
		    }
		    return tweets;
	}

	
}
