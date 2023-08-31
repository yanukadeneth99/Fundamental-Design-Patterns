package Behavioral.Command;

public class MealOrder implements IOrder {

  // Holding the meal instance
  private IMenu meal;

  // Constructor to set the instance
  public MealOrder(IMenu meal) {
    this.meal = meal;
  }

  @Override
  public void execute() {
    meal.prepareMenu();
  }
}
