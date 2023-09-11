package Structural.Decorator;

public class Bread extends Meal {
  public Bread() {
    description = "Noodles";
  }

  @Override
  public double cost() {
    return 80;
  }
}
