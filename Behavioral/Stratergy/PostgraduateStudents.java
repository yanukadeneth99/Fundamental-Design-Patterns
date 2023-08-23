package Behavioral.Stratergy;

public class PostgraduateStudents extends Students {

  // Assigning the festival and program when this object is created
  public PostgraduateStudents() {
    festival = new RoboFest();
    program = new DoctoralPrograms();
  }

  // Displaying as Postgraduate Students
  @Override
  public void displayStudents() {
    System.out.println("Postgraduate Students");
  }

}
