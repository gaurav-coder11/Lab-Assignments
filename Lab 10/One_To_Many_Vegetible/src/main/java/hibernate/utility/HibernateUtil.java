package hibernate.utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Vegetables;


public class HibernateUtil {
	// Declare a static SessionFactory variable for creating Hibernate sessions.
		static SessionFactory factory = null;
	    // Static block that runs when the class is loaded.
		static {
	        // Create a Configuration object to configure Hibernate.
			Configuration cfg = new Configuration();
			
			// Load Hibernate configuration from "Connection.cfg.xml" file.
	        cfg.configure("Connection.cfg.xml");

	        // Add the Employee class as an annotated class for Hibernate.
	        cfg.addAnnotatedClass(Vegetables.class);

	        // Build the SessionFactory using the configuration.
	        factory = cfg.buildSessionFactory();
	    }

	    // Public method to get the SessionFactory.
	    public static SessionFactory getSessionFactory() {
	        return factory;
	    }

	    // Public method to open a new Hibernate session.
	    public static Session getSession() {
	        return factory.openSession();
	    }
	}