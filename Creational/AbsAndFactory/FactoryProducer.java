package Creational.AbsAndFactory;

class FactoryProducer {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("SHAPE")) {
      return new ShapeFactory();
    } else if (choice.equalsIgnoreCase("COLOR")) {
      return new ColorFactory();
    }
    return null;
  }

  // Private Constructor to prevent it being called
  private FactoryProducer() {
  }
}
