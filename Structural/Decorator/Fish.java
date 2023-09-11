package Structural.Decorator;

public class Fish extends MealDecorator {
  Meal meal;

  public Fish(Meal meal) {
    this.meal = meal;
  }

  @Override
  public String getDescription() {
    return meal.getDescription() + ", Fish";
  }

  @Override
  public double cost() {
    return 40 + meal.cost();
  }
}
