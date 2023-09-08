package Behavioral.COF;

abstract public class GradeHandler {
  protected GradeHandler gradehandler;

  public void setGrade(GradeHandler gradehandler) {
    this.gradehandler = gradehandler;
  }

  abstract public void processGrade(Grade grade);
}
