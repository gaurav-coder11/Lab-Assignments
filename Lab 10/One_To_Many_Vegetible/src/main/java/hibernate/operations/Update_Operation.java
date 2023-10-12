package hibernate.operations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.entity.Vegetables;
import hibernate.utility.HibernateUtil;

public class Update_Operation {
	public static void main(String[] args) {
		// Creating a Hibernate SessionFactory instance using the HibernateUtil class
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Opening a new Hibernate Session using the HibernateUtil class
		Session ses = HibernateUtil.getSession();

		try {
			// Beginning a transaction to group database operations
			ses.beginTransaction();

			Vegetables veg = ses.get(Vegetables.class, 1);
			// Update the employee's information
			veg.setvPrice(25.00);

			// Save the changes to the database
			ses.update(veg);

			// Committing the transaction (if successful) or rolling back (if there was an
			// exception)
			ses.getTransaction().commit();
		} catch (Exception e) {
			// Handling any exceptions that may occur during database operations
			e.printStackTrace();
		} finally {

			// Closing the Hibernate Session to release resources
			ses.close();
		}
	}
}
