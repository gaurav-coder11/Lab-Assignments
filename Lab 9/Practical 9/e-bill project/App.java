package hibernate.E_Bill_Vegitable.maven.E_Billing_System;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
    // Create a Hibernate configuration object
    Configuration cfg = new Configuration();
    
    // Load the Hibernate configuration from the XML file (connection.cfg.xml)
    cfg.configure("connection.cfg.xml");

    // Create a Hibernate SessionFactory
    SessionFactory factory = cfg.buildSessionFactory();

    // Open a Hibernate Session
    Session session = factory.openSession();

    // Begin a database transaction
    Transaction tx = session.beginTransaction();

    // Create a new instance of the Vegetables entity
    Vegetables veg = new Vegetables();
    veg.setVegid(2);
    veg.setItmName("broccoli");
    veg.setPrice("60 r.");
    veg.setQuantity("10 kg");

    // Save the Vegetables object to the database
    session.save(veg);

    // Commit the transaction (save changes to the database)
    tx.commit();

    // Close the Hibernate Session
    session.close();
  }
}
