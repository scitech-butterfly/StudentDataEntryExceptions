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

  // Method to Display Student Details
  public void displayStudents() {
   for (Student student : students) {
    student.display();
   }
  }

  // Search Student by PRN
  public Student searchByPRN(long prn) {
   for (Student student : students) {
    if (student.getPRN() == prn) {
     return student;
    }
   }
   return null;
  }

  // Search Student by Name
  public Student searchByName(String name) {
   for (Student student : students) {
    if (student.getName().equalsIgnoreCase(name)) {
     return student;
    }
   }
   return null;
  }

  // Search Student by Position (Index)
  public Student searchByPosition(int position) {
   if (position >= 0 && position < students.size()) {
    return students.get(position); // Get the student at the given index
   } else {
    System.out.println("Invalid position! Please enter a valid index.");
    return null; // Return null if the position is out of bounds
   }
  }
}
