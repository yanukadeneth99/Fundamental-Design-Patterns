package Behavioral.COF;

public class AverageGradeHandler extends GradeHandler {
  @Override
  public void processGrade(Grade grade) {
    if (grade.getAmount() >= 40 && grade.getAmount() < 60) {
      System.out.println("C");
    } else {
      if (gradehandler != null)
        // GradeHandler exists in the abstract class
        gradehandler.processGrade(grade);
    }
  }
}
