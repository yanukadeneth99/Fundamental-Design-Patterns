package Behavioral.Command;

public class Waiter {

  // Holding the Order Instances
  private IOrder juiceOrder;
  private IOrder mealOrder;
  private IOrder dessertOrder;

  // Setting the order instances
  public void setOrder(IOrder juiceOrder, IOrder mealOrder, IOrder dessertOrder) {
    this.juiceOrder = juiceOrder;
    this.mealOrder = mealOrder;
    this.dessertOrder = dessertOrder;
  }

  // Setting some starter values in the constructer to prevent issues.
  public Waiter() {
    this.juiceOrder = new JuiceOrder(new Juice("Juice"));
    this.mealOrder = new MealOrder(new Meal("Meal"));
    this.dessertOrder = new DessertOrder(new Dessert("Dessert"));
  }

  // Executing the Meal
  public void selectMeal() {
    mealOrder.execute();
  }

  // Executing the Dessert
  public void selectDessert() {
    dessertOrder.execute();
  }

  // Executing the Juice
  public void selectJuice() {
    juiceOrder.execute();
  }
}
