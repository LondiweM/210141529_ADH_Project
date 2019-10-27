package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.TwitterEntity;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Session Bean implementation class TwitterEJB
 */
@Stateless
@LocalBean
public class TwitterEJB {

	@PersistenceContext
	private EntityManager em;
	
    public TwitterEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void AddNew(TwitterEntity twitterentity)
    {
    	 //getting current date and time using Date class
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        /*getting current date time using calendar class 
         * An Alternative of above*/
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));
    	System.out.println("Adding Yee");
    	em.persist(twitterentity);
    }
    
    public List<TwitterEntity> findTwitts() {
    	List<TwitterEntity> transdetails = em.createQuery("Select e from twitter_table e"
    			,TwitterEntity.class).getResultList();
    	return transdetails;
    }
    public void viewList(TwitterEntity twitterentity)
    {
    	System.out.println("Viewing the details");
    	em.persist(twitterentity);
    }
   
}

