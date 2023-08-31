package Behavioral.Command;

public class DessertOrder implements IOrder {

  // Holding the dessert instance
  private IMenu dessert;

  // Constructor to set the instance
  public DessertOrder(IMenu dessert) {
    this.dessert = dessert;
  }

  @Override
  public void execute() {
    dessert.prepareMenu();
  }
}
