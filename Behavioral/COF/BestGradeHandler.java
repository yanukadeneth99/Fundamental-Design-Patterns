package Behavioral.COF;

public class BestGradeHandler extends GradeHandler {
  @Override
  public void processGrade(Grade grade) {
    if (grade.getAmount() >= 80) {
      System.out.println("A");
    } else {
      if (gradehandler != null)
        // GradeHandler exists in the abstract class
        gradehandler.processGrade(grade);
    }
  }
}
