package Behavioral.Stratergy;

public class Stratergy {
  public static void main(String[] args) {
    Students poStudents = new PostgraduateStudents();
    poStudents.offerPrograms();
    poStudents.conductEvents();
    poStudents.displayStudents();

    System.out.println("========= ASSIGN NEW EVENT ==========");
    poStudents.setFestival(new CodeFest());
    poStudents.conductEvents();

    System.out.println("====================");
    Students unStudents = new UndergraduateStudents();
    unStudents.offerPrograms();
    unStudents.conductEvents();
    unStudents.displayStudents();

    System.out.println("========= ASSIGN NEW PROGRAM ==========");
    unStudents.setPrograms(new MScPrograms());
    unStudents.offerPrograms();

  }
}
