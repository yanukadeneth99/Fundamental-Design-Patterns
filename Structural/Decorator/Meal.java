package Structural.Decorator;

abstract public class Meal {
  String description = "Meal";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
