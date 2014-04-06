package es.uc3m.dps.testtwiter;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import twitter4j.TwitterException;

public class TweetDAOImplTest {

	@Test
	public void test() {
		TweetDAO dao = new TweetDAOImpl();
		List<String> tweets;
		try {
			tweets = dao.search("bieber");
			Assert.assertEquals(15, tweets.size());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
