package es.uc3m.dps.testtwiter;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "tweets")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tweets", propOrder = {
    "listTweets"
})
public class ListTweetTO {

	List<TweetTO> listTweets;

	public ListTweetTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListTweetTO(List<TweetTO> tweets) {
		this.listTweets = tweets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((listTweets == null) ? 0 : listTweets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListTweetTO other = (ListTweetTO) obj;
		if (listTweets == null) {
			if (other.listTweets != null)
				return false;
		} else if (!listTweets.equals(other.listTweets))
			return false;
		return true;
	}

	public List<TweetTO> getListTweets() {
		return listTweets;
	}

	public void setListTweets(List<TweetTO> listTweets) {
		this.listTweets = listTweets;
	}

	@Override
	public String toString() {
		return "ListTweetTO [listTweets=" + listTweets + "]";
	}
	
}
