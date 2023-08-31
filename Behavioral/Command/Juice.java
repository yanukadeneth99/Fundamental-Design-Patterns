package Behavioral.Command;

public class Juice implements IMenu {

  // Holding the kind of juice
  private String juice;

  // Set the kind of juice in the constructor
  public Juice(String juice) {
    this.juice = juice;
  }

  @Override
  public void prepareMenu() {
    System.out.println("Prepare " + juice + " Juice");
  }
}
