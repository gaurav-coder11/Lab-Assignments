package hibernate.conection.meven.StudentRecords;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	    // Define a private static final SessionFactory
	    private static final SessionFactory sessionFactory = buildSessionFactoryNew();

	    // Private method to build and configure the SessionFactory
	    private static SessionFactory buildSessionFactory() {
	        System.out.println("abc");
	        try {
	            // Create and configure the SessionFactory using the "Connection.cfg.xml" configuration file
	            return new Configuration().configure("Connection.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("Initial SessionFactory creation failed " + ex);
	            // Throw an exception in case of initialization failure
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    // Private method to build and configure the SessionFactory using the new approach
	    private static SessionFactory buildSessionFactoryNew() {
	        // Create a StandardServiceRegistry based on the configuration in "Connection.cfg.xml"
	        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("Connection.cfg.xml").build();
	        // Build Metadata using the standard registry
	        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
	        // Build and return the SessionFactory
	        return metadata.getSessionFactoryBuilder().build();
	    }

	    // Public method to get the SessionFactory
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}
