package main;
// Student.java

class Student {
  private String name;
  private long prn;
  private String branch;
  private String batch;
  private double cgpa;

  // Parameterized Constructor
  public Student(String name, long prn, String branch, String batch, double cgpa) {
    this.name = name;
    this.prn = prn;
    this.branch = branch;
    this.batch = batch;
    this.cgpa = cgpa;
  }

  // Getter-Setter Methods for private members
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPRN() {
    return prn;
  }

  public void setPRN(long prn) {
    this.prn = prn;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public double getCGPA() {
    return cgpa;
  }

  public void setCGPA(double cgpa) {
    this.cgpa = cgpa;
  }

  // Method to display students
  public void display() {
    System.out.println(
        "Student Name: " + name + "\nPRN: " + prn + "\nBranch: " + branch + "\nBatch: " + batch + "\nCGPA: " + cgpa);
  }
}
