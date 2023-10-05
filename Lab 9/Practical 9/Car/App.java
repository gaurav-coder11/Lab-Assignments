package com.hibernate.newhiber.NewHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
	  // Create a Hibernate configuration object
      Configuration cfg = new Configuration();
      
      // Load the Hibernate configuration from the XML file (hibernate.cfg.xml)
      cfg.configure("hibernate.cfg.xml");

      // Create a Hibernate SessionFactory
      SessionFactory factory = cfg.buildSessionFactory();

      // Open a new Hibernate Session
      Session session = factory.openSession();

      // Begin a database transaction
      Transaction tx = session.beginTransaction();

      // Create a new instance of the Car1 entity
      Cars cr = new Cars();
      cr.setId(2);
      cr.setCarName("Ferrari Roma");
      cr.setCost("Rs.3.76 Crs");

      // Save the Car1 object to the database
      session.save(cr);

      // Commit the transaction (save changes to the database)
      tx.commit();

      // Close the Hibernate Session
      session.close();
      
      // Close the Hibernate SessionFactory when done
      factory.close();
  }
}