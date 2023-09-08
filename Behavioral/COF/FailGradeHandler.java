package Behavioral.COF;

public class FailGradeHandler extends GradeHandler {
  @Override
  public void processGrade(Grade grade) {
    if (grade.getAmount() < 40) {
      System.out.println("F (Fail)");
    } else {
      if (gradehandler != null)
        // GradeHandler exists in the abstract class
        gradehandler.processGrade(grade);
    }
  }
}
