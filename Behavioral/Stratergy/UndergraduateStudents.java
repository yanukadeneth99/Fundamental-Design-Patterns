package Behavioral.Stratergy;

public class UndergraduateStudents extends Students {
  // Assigning the festival and program when this object is created
  public UndergraduateStudents() {
    festival = new CodeFest();
    program = new BScPrograms();
  }

  // Displaying as Undergraduate Students
  @Override
  public void displayStudents() {
    System.out.println("Undergraduate Students");
  }
}
