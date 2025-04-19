# StudentDataEntryExceptions

A Java console application designed to manage student data with robust exception handling using custom exceptions. This project is structured using packages and modular Java classes to maintain clarity and adherence to coding guidelines.

## Student Details (As per assignment requirements)
- Name: Kashvi Singh  
- PRN: 23070126057  
- Batch: AIML A3

---

## Project Structure

```bash
src/
├── main/
│   ├── Main.java                  # Entry point of the program with user menu
│   ├── Student.java               # Student class (POJO)
│   └── StudentOperations.java     # Core functionalities: add, update, delete, search, etc.
└── exceptions/
    ├── DuplicatePRNException.java
    ├── InvalidCGPAException.java
    ├── InvalidPositionException.java
    └── StudentNotFoundException.java
```

---

## Features & Functionalities

Each functionality is implemented in a separate function, with appropriate use of custom exceptions for effective error handling:

| Functionality              | Description |
|---------------------------|-------------|
| Add Student               | Adds student to list; throws `DuplicatePRNException`, `InvalidCGPAException` |
| Display Students          | Lists all students in the system |
| Search by PRN             | Searches student using PRN; throws `StudentNotFoundException` |
| Search by Name            | Finds first student by name |
| Search by Position        | Accesses student by list index; throws `InvalidPositionException` |
| Update Student Details    | Updates fields based on PRN; throws `StudentNotFoundException`, `InvalidCGPAException` |
| Delete Student            | Deletes student using PRN; throws `StudentNotFoundException` |

---

## How to Compile & Run

Ensure you're inside the `src` directory:

```bash
# Compile all files
javac main/*.java exceptions/*.java

# Run the main program
java main.Main
```

---

## Custom Exceptions

All exceptions are custom-defined and extend from `Exception`:

- `DuplicatePRNException` – Thrown when a student with the same PRN already exists.
- `InvalidCGPAException` – Thrown when the CGPA is not within valid bounds (0.0 to 10.0).
- `InvalidPositionException` – Thrown when an invalid index is accessed in the list.
- `StudentNotFoundException` – Thrown when no student matches a query by PRN or other criteria.

---

## Commit & GitHub Guidelines

- Each Java file should have its own separate commit.
- Each function implementation should have its own commit.
- Program must be pushed to your GitHub repository.
- All Java files should include comments for logic explanation.
- `Main.java` should include your Name, PRN, and Batch at the top as per instructions.

---

## Coding Best Practices Followed

- Modularization through classes and packages.
- Clear method separation for functionalities.
- Custom exceptions for better error reporting.
- Scanner for input and clean console interactions.
- Comments included for all logical blocks.

---

