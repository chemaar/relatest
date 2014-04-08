package example.jbehave;
import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.embedder.Embedder;

import twitter4j.TwitterException;
import es.uc3m.dps.testtwiter.NaiveTweetDAOImpl;
import es.uc3m.dps.testtwiter.TweetService;

public class TweetSearchStories extends Embedder{
	private TweetService testService;
	private String query;

	@Given("a naive Tweet search service")
	public void anEmptyStack() {
		testService = new TweetService(new NaiveTweetDAOImpl());
	}

	@When("the string $query to search is added")
	public void aQueryIsAdded(String query) {
		this.query = query;
	}

	@Then("the size should be $result")
	public void theResultingElementShouldBe(int result) {
		try {
			Assert.assertEquals(this.testService.search(this.query).getListTweets().size(), result);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

}