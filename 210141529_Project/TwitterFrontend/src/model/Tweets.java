package model;

import java.util.Date;
import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entities.TwitterEntity;

@ManagedBean(name="tweet")
@SessionScoped
public class Tweets {
	private String tweetBody;
	private  Timestamp timestamp;
	private int tweetID;
	
	public String getTweetBody() {
		return tweetBody;
	}
   public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getTweetID() {
		return tweetID;
	}

	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}

	public TwitterEntity getEntity()
	{
	 Date date=new Date();
	 long time =date.getTime();
	 Timestamp ts=new Timestamp(time);
	 TwitterEntity twitterentity=new TwitterEntity();
	 twitterentity.setTimestamp(ts);
	 twitterentity.setTweetBody(tweetBody);
	 twitterentity.setId(tweetID);
	 return twitterentity;
	}
}

