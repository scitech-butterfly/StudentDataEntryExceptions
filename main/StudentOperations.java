package main;
// StudentOperations.java

import java.util.*;

import exceptions.DuplicatePRNException;
import exceptions.InvalidCGPAException;
import exceptions.InvalidPositionException;
import exceptions.StudentNotFoundException;

class StudentOperations {
    ArrayList<Student> students; // array list of data type Student (object) which is a combination of String and
                                 // int

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Method to add student
    public void addStudents(Student student)
            throws DuplicatePRNException, InvalidCGPAException {
        try {
            if (searchByPRN(student.getPRN()) != null) {
                throw new DuplicatePRNException("PRN already exists!");
            }
        } catch (StudentNotFoundException e) {
            // Student does not exist – this is expected. Do nothing.
        }

        if (student.getCGPA() < 0.0 || student.getCGPA() > 10.0) {
            throw new InvalidCGPAException("Invalid CGPA entered! Must be between 0.0 and 10.0.");
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to Display Student Details
    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

    // searchByPRN to throw exception
    public Student searchByPRN(long prn) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
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

    // Search Student by Position (Index) with exception
    public Student searchByPosition(int position) throws InvalidPositionException {
        if (position < 0 || position >= students.size()) {
            throw new InvalidPositionException("Position out of range.");
        }
        return students.get(position);
    }

    // Update Student Details by PRN with exceptions
    public void updateStudent(long prn, String name, String branch, String batch, double cgpa)
            throws StudentNotFoundException, InvalidCGPAException {
        Student student = searchByPRN(prn);
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new InvalidCGPAException("CGPA must be between 0.0 and 10.0.");
        }
        student.setName(name);
        student.setBranch(branch);
        student.setBatch(batch);
        student.setCGPA(cgpa);
        System.out.println("Student details updated.");
    }

    // Delete Student by PRN with custom exception
    public boolean deleteStudent(long prn) throws StudentNotFoundException {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
            return true;
        }
        throw new StudentNotFoundException("Cannot delete: Student with PRN " + prn + " not found.");
    }
}
