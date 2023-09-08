package Behavioral.COF;

public class MeritGradeHandler extends GradeHandler {
  @Override
  public void processGrade(Grade grade) {
    if (grade.getAmount() >= 60 && grade.getAmount() < 80) {
      System.out.println("B");
    } else {
      if (gradehandler != null)
        // GradeHandler exists in the abstract class
        gradehandler.processGrade(grade);
    }
  }
}
