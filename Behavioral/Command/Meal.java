package Behavioral.Command;

public class Meal implements IMenu {

  // Holding the kind of meal
  private String meal;

  // Set the kind of meal in the constructor
  public Meal(String meal) {
    this.meal = meal;
  }

  @Override
  public void prepareMenu() {
    System.out.println("Prepare " + meal + " Meal");
  }
}
