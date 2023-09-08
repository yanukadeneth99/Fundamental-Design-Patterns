package Behavioral.Template;

public class Coffee extends Beverage {
  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }
}
