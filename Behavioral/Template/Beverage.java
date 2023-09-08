package Behavioral.Template;

abstract public class Beverage {

  // Defining the life cycles
  void prepareRecipe() {
    boilWater();
    brew();
    addCondiments();
    pourInCup();
  }

  abstract void addCondiments();

  abstract void brew();

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }
}
