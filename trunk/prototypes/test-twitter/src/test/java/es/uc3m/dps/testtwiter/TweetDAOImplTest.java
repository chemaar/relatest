package es.uc3m.dps.testtwiter;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import twitter4j.TwitterException;

public class TweetDAOImplTest {

	@Test
	public void test() {
		TweetDAO dao = new TweetDAOImpl();
		List<TweetTO> tweets;
		try {
			tweets = dao.search("bieber");
			Assert.assertEquals(15, tweets.size());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	@Test
	public void testFailed() {
		TweetDAO dao = new TweetDAOImpl();
		List<TweetTO> tweets;
		try {
			tweets = dao.search(" ");
			Assert.assertTrue(false);
		} catch (TwitterException e) {
		
		}
	
		
	}
}
