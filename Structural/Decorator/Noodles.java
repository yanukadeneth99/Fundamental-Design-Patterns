package Structural.Decorator;

public class Noodles extends Meal {
  public Noodles() {
    description = "Noodles";
  }

  @Override
  public double cost() {
    return 90;
  }
}
