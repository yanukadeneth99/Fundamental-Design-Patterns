package Behavioral.Command;

public class Customer {
  public static void main(String[] args) {

    // Create a new waiter
    Waiter waiter = new Waiter();

    // Set the Meals
    IMenu juice = new Juice("Orange Juice");
    IMenu meal = new Meal("Noodles");
    IMenu desert = new Dessert("Ice Cream");

    // Create the orders
    IOrder juiceOrder = new JuiceOrder(juice);
    IOrder mealOrder = new MealOrder(meal);
    IOrder desertOrder = new DessertOrder(desert);

    // Set the orders and select each meal
    waiter.setOrder(juiceOrder, mealOrder, desertOrder);
    waiter.selectJuice();
    waiter.selectMeal();
    waiter.selectDessert();
  }
}
