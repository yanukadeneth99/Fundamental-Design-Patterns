package Behavioral.Template;

public class Template {
  static Beverage beverage = null;

  public static void main(String[] args) {
    System.out.println("===TEA===");
    Beverage tea = new Tea();
    tea.prepareRecipe();

    System.out.println("===COFFEE===");
    Beverage coffee = new Coffee();
    coffee.prepareRecipe();
  }
}
