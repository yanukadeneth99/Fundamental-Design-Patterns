package Behavioral.COF;

import java.util.Scanner;

public class COF {
  public static void main(String[] args) {

    BestGradeHandler bestGradeHandler = new BestGradeHandler();
    AverageGradeHandler averageGradeHandler = new AverageGradeHandler();
    MeritGradeHandler meritGradeHandler = new MeritGradeHandler();
    FailGradeHandler failGradeHandler = new FailGradeHandler();

    bestGradeHandler.setGrade(meritGradeHandler);
    meritGradeHandler.setGrade(averageGradeHandler);
    averageGradeHandler.setGrade(failGradeHandler);

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter marks for Grade = ");
      int marks = scanner.nextInt();
      bestGradeHandler.processGrade(new Grade(marks));
    }
  }
}
