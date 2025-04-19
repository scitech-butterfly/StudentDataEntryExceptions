// CustomExceptions.java

 class DuplicatePRNException extends Exception {
     public DuplicatePRNException(String message) {
         super(message);
     }
 }

class InvalidCGPAException extends Exception {
     public InvalidCGPAException(String message) {
         super(message);
     }
 }

class StudentNotFoundException extends Exception {
     public StudentNotFoundException(String message) {
         super(message);
     }
 }
