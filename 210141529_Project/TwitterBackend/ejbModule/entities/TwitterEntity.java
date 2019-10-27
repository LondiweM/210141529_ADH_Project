package entities;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;


@Entity(name="twitter_table")
public class TwitterEntity {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Generated(GenerationTime.ALWAYS)
	//@Temporal(javax.persistence.TemporalType.DATE)

	@TableGenerator(
			  name = "yourTableGenerator",
			  initialValue = 0000)
			@Id
			@GeneratedValue(
			  strategy=GenerationType.TABLE, 
			  generator="yourTableGenerator")
	
	private long id;
	private String TweetBody;
	private Timestamp Timestamp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTweetBody() {
		return TweetBody;
	}
	public void setTweetBody(String tweetBody) {
		TweetBody = tweetBody;
	}
	public Timestamp getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}
	
	
}
