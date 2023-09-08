package Behavioral.Template;

public class Tea extends Beverage {
  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }
}
