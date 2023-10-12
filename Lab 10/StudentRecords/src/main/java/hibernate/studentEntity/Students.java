package hibernate.studentEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Define the entity and specify the table name
@Entity
@Table(name = "Student")
public class Students {
 // Define the primary key
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "sid")
 private int id;

 // Define the column for the student's name
 @Column(name = "sname")
 private String studName;

 // Define a many-to-one relationship with the "Cource" entity, specifying the foreign key column
 @ManyToOne
 @JoinColumn(name = "dept_id")
 private Cource stddepartment;

 // Getter method for student name
 public String getStudName() {
     return studName;
 }

 // Setter method for student name
 public void setStudName(String studName) {
     this.studName = studName;
 }

 // Getter method for the department
 public Cource getStddepartment() {
     return stddepartment;
 }

 // Setter method for the department
 public void setStddepartment(Cource stddepartment) {
     this.stddepartment = stddepartment;
 }

 // Parameterized constructor for the Students class
 public Students(String studName, Cource stddepartment) {
     super();
     this.studName = studName;
     this.stddepartment = stddepartment;
 }

 // Default constructor for the Students class
 public Students() {
     super();
     // TODO Auto-generated constructor stub
 }
}
