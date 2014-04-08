package es.uc3m.dps.testtwiter;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class NaiveTweetDAOImpl implements TweetDAO {
//	protected static Logger logger = Logger.getLogger(TweetDAOImpl.class);
	
	protected static final int MAX_TWEETS = 15;

	public List<TweetTO> search(String queryStr) throws TwitterException {
		if(queryStr==null || queryStr.equalsIgnoreCase("")){
			throw new TwitterException("Invalid query string");
		}
		  List<TweetTO> tweets =  new LinkedList<TweetTO>();
		  for (int i = 0; i<MAX_TWEETS; i++){
			  	TweetTO myTweet = new TweetTO();
		    	myTweet.setId(""+i);
		    	myTweet.setUserId(""+i);
		    	myTweet.setText("Status "+i);
		    	myTweet.setCreated(Calendar.getInstance().getTime());
		    	tweets.add(myTweet);
		  }
		  return tweets;
		  
	}

	
}
