package Behavioral.Command;

public class JuiceOrder implements IOrder {

  // Holding the juice instance
  private IMenu juice;

  // Constructor to set the instance
  public JuiceOrder(IMenu juice) {
    this.juice = juice;
  }

  @Override
  public void execute() {
    juice.prepareMenu();
  }

}
