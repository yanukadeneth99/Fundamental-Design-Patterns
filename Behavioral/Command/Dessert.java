package Behavioral.Command;

public class Dessert implements IMenu {

  // Holding the kind of dessert
  private String dessert;

  // Set the kind of dessert in the constructor
  public Dessert(String dessert) {
    this.dessert = dessert;
  }

  @Override
  public void prepareMenu() {
    System.out.println("Prepare " + dessert + " Dessert");
  }
}
