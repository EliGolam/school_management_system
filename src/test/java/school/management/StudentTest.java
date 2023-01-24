package school.management;

import org.junit.Test;

import school.management.classes.Student;

import static org.junit.Assert.assertEquals;

/**
 * Unit Testing for the Student Class
 */
public class StudentTest {
  @Test
  public void createStudent() {
    String name = "Britney"; 
    int fees = 50000;
    int feesPaid = 0;
    int year = 1;

    Student britney = new Student(name, fees, feesPaid, year);

    assertEquals(britney.getName(), name);
    assertEquals(britney.getFees(), fees);
    assertEquals(britney.getFeesPaid(), feesPaid);
    assertEquals(britney.getYear(), year);
    assertEquals(britney.getId(), 1);

    Student vivian = new Student("Vivian", 10000); 
    Student lorraine = new Student("Lorraine", 5000);

    assertEquals(vivian.getId(), 2);
    assertEquals(lorraine.getId(), 3);
  }
}
