// StudentOperations.java

import java.util.*;

class StudentOperations {
  ArrayList<Student> students; // array list of data type Student (object) which is a combination of String and int

  public StudentOperations() {
   this.students = new ArrayList<>();
  }

  // Method to add students to the ArrayList
  public void addStudents(Student student) {
   students.add(student);
   System.out.println("Student added.");
  }
}
