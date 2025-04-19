package main;
// Name: Kashvi Singh

// PRN: 23070126057
// Batch: AIML A3

// Main.java

import java.util.*;

import exceptions.*;

class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // To take user input
      StudentOperations operations = new StudentOperations(); // Instance of StudentOperations

      while (true) {
         // Display Menu
         System.out.println("\nMenu:");
         System.out.println("1. Add Student");
         System.out.println("2. Display Students");
         System.out.println("3. Search Student by PRN");
         System.out.println("4. Search Student by Name");
         System.out.println("5. Search Student by Position");
         System.out.println("6. Update Student Details");
         System.out.println("7. Delete Student");
         System.out.println("0. Exit");
         System.out.print("Enter your choice: ");

         // Take integer input for user-choice
         int choice = Integer.parseInt(scan.nextLine());

         // Exit the program if choice is 0
         if (choice == 0) {
            System.out.println("Exiting the program...");
            break;
         }

         switch (choice) {
            case 1: // Add Student
               try {
                  System.out.print("Enter Name: ");
                  String name = scan.nextLine();
                  System.out.print("Enter PRN: ");
                  long prn = Long.parseLong(scan.nextLine());
                  System.out.print("Enter Branch: ");
                  String branch = scan.nextLine();
                  System.out.print("Enter Batch: ");
                  String batch = scan.nextLine();
                  System.out.print("Enter CGPA: ");
                  double cgpa = Double.parseDouble(scan.nextLine());

                  Student student = new Student(name, prn, branch, batch, cgpa);
                  operations.addStudents(student);
               } catch (Exception e) {
                  System.out.println("Error: " + e.getMessage());
               }

               break;

            case 2: // Display Students
               operations.displayStudents();
               break;

            case 3: // Search Student by PRN
               try {
                  System.out.print("Enter PRN to search: ");
                  long prn = Long.parseLong(scan.nextLine());
                  Student found = operations.searchByPRN(prn);
                  found.display();
               } catch (StudentNotFoundException e) {
                  System.out.println("Error: " + e.getMessage());
               }
               break;
            case 4: // Search Student by Name
               System.out.print("Enter Name to search: ");
               String name = scan.nextLine();
               Student foundByName = operations.searchByName(name);
               if (foundByName != null) {
                  foundByName.display();
               } else {
                  System.out.println("Student not found.");
               }
               break;

            case 5: // Search Student by Position
               try {
                  System.out.print("Enter position (index starts from 0): ");
                  int position = Integer.parseInt(scan.nextLine());
                  Student found = operations.searchByPosition(position);
                  found.display();
               } catch (InvalidPositionException e) {
                  System.out.println("Error: " + e.getMessage());
               }
               break;

            case 6: // Update Student
               try {
                  System.out.print("Enter PRN to update: ");
                  long prn = Long.parseLong(scan.nextLine());
                  System.out.print("Enter New Name: ");
                  name = scan.nextLine();
                  System.out.print("Enter New Branch: ");
                  String branch = scan.nextLine();
                  System.out.print("Enter New Batch: ");
                  String batch = scan.nextLine();
                  System.out.print("Enter New CGPA: ");
                  double cgpa = Double.parseDouble(scan.nextLine());

                  operations.updateStudent(prn, name, branch, batch, cgpa);
               } catch (StudentNotFoundException | InvalidCGPAException e) {
                  System.out.println("Error: " + e.getMessage());
               }

            case 7: // // Delete Student
               try {
                  System.out.print("Enter PRN to delete: ");
                  long prn = Long.parseLong(scan.nextLine());
                  operations.deleteStudent(prn);
               } catch (StudentNotFoundException e) {
                  System.out.println("Error: " + e.getMessage());
               }
               break;

            default:
               System.out.println("Invalid choice! Please enter a valid option.");
         }
      }
      scan.close();
   }
}
