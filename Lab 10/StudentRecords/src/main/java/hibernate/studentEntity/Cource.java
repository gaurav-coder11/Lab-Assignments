package hibernate.studentEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Define the entity and specify the table name
@Entity
@Table(name = "Cource")
public class Cource {
 // Define the primary key
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "dept_id")
 private int id;

 // Define the column for the department name
 @Column(name = "ddepartment")
 private String department;

 // Define a one-to-many relationship with the "Students" entity, specifying the mappedBy attribute and cascade type
 @OneToMany(mappedBy = "stddepartment", cascade = CascadeType.ALL)
 private List<Students> students = new ArrayList<Students>();

 // Getter method for the department name
 public String getDepartment() {
     return department;
 }

 // Setter method for the department name
 public void setDepartment(String department) {
     this.department = department;
 }

 // Getter method for the list of students associated with the department
 public List<Students> getStudents() {
     return students;
 }

 // Setter method for the list of students associated with the department
 public void setStudents(List<Students> students) {
     this.students = students;
 }

 // Parameterized constructor for the Cource class
 public Cource(String department, List<Students> students) {
     super();
     this.department = department;
     this.students = students;
 }

 // Default constructor for the Cource class
 public Cource() {
     super();
     // TODO Auto-generated constructor stub
 }
}
