package es.uc3m.dps.testtwiter;

import java.util.Observable;
import java.util.Observer;

public class TweetTimelineObserver implements Observer {

	public void update(Observable from, Object value) {
		 System.out.println("Message received (" + from + "," + value + ");");

	}


}
