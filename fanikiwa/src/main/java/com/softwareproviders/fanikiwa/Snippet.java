package com.softwareproviders.fanikiwa;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import com.softwareproviders.fanikiwa.Beans.*;

public class Snippet {
	
	public static void main(String[] args) {
	
		//creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Offer offer=new Offer();  
	    offer.setId(1);  
	    offer.setMemberId(2);  
	    offer.setTerm(3);  
	      
	    session.persist(offer);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
		
	}
}

