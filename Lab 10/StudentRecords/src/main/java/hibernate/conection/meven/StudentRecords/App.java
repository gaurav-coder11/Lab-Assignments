package hibernate.conection.meven.StudentRecords;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.studentEntity.Cource;
import hibernate.studentEntity.Students;

public class App {
	public static void main(String[] args) {
	    // Get a Hibernate SessionFactory
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    
	    // Open a new session
	    Session session = sessionFactory.openSession();
	    
	    // Begin a transaction
	    session.beginTransaction();
	    
	    try {
	        // Create a new course (Cource) object and set its department
	        Cource course = new Cource();
	        course.setDepartment("CSE");

	        // Create two student (Students) objects and set their names and the associated course
	        Students student1 = new Students();
	        student1.setStudName("Roshan");
	        student1.setStddepartment(course);

	        Students student2 = new Students();
	        student2.setStudName("Minashi");
	        student2.setStddepartment(course);

	        // Add the students to the course's list of students
	        course.getStudents().add(student1);
	        course.getStudents().add(student2);

	        // Save the course and associated students to the database
	        session.save(course);

	        // Commit the transaction
	        session.getTransaction().commit();
	    } finally {
	        // Close the session and the sessionFactory
	        session.close();
	        sessionFactory.close();
	    }
	}
}