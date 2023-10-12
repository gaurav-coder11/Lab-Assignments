package hibernate.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.entity.Vegetables;
import hibernate.utility.HibernateUtil;

public class Insert_Operation {
	public static void main(String[] args) {
	// Creating a Hibernate SessionFactory instance using the HibernateUtil class
	SessionFactory factory = HibernateUtil.getSessionFactory();
	// Opening a new Hibernate Session using the HibernateUtil class
	Session ses = HibernateUtil.getSession();

	try
	{
		// Beginning a transaction to group database operations
		ses.beginTransaction();
		// Creating a new Vegetables object and initializing it with data
		Vegetables veg1 = new Vegetables("Potato","20 kg",20.00);
		Vegetables veg2 = new Vegetables("Cabbage","40 kg",60.00);
		Vegetables veg3 = new Vegetables("Tomato","20 kg",40.00);
		Vegetables veg4 = new Vegetables("Cauliflower","50 kg",50.00);
		Vegetables veg5 = new Vegetables("Carrot","60 kg",70.00);
		
		// Saving the newly created Employee object to the database
		ses.save(veg1);
		ses.save(veg2);
		ses.save(veg3);
		ses.save(veg4);
		ses.save(veg5);
	}catch(
	Exception e)
	{
		// Handling any exceptions that may occur during database operations
		e.printStackTrace();
	}finally
	{
		// Committing the transaction (if successful) or rolling back (if there was an
		// exception)
		ses.getTransaction().commit();
		// Closing the Hibernate Session to release resources
		ses.close();
	}
	}
}


