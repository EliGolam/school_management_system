package school.management.classes;

import java.io.Serializable;

public class Student implements Serializable {
  private static int studentIdCounter = 0;

  private int id;
  private String name; 
  private int fees = 1;
  private int feesPaid = 0;
  private int year = 1; 

  // Constructors
  /**
   * Create a new Student Entry
   * @param name : name is the student's first and last name
   * @param fees : fees is the amount the student needs to pay to the school
   */
  public Student(String name, int fees) {
    this.id = getNewId();
    this.name = name;
    this.fees = fees;
  }

  /**
   * Create a new Student Entry
   * @param name
   * @param fees
   * @param feesPaid
   */
  public Student(String name, int fees, int feesPaid) {
    this.id = getNewId();
    this.name = name;
    this.fees = fees;
    this.feesPaid = feesPaid;
  }

  /**
   * Create a new Student Entry
   * @param name
   * @param fees
   * @param feesPaid
   * @param year
   */
  public Student(String name, int fees, int feesPaid, int year) {
    this.id = getNewId();
    this.name = name;
    this.fees = fees;
    this.feesPaid = feesPaid;
    this.year = year;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setFees(int fees) {
    this.fees = fees;
  }

  public int getFees() {
    return fees;
  }

  public void setFeesPaid(int feesPaid) {
    this.feesPaid = feesPaid;
  }

  public int getFeesPaid() {
    return feesPaid;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return year;
  }


  // Management Methods
  public void addFees(int amount) {
    if (amount <= 0) return; 

    this.fees += amount;
  }

  public void payFees(int amount) {
    if (amount <= 0) {
      System.out.println("Positive amount expected");
      return;
    }

    this.feesPaid += amount;
  }

  // Private Methods 
  private static int getNewId() {
    studentIdCounter++;
    return studentIdCounter;
  }
  
}
