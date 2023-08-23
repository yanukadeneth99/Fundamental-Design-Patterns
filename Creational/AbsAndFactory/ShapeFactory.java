package Creational.AbsAndFactory;

class ShapeFactory extends AbstractFactory {
  @Override
  public Object getObject(String type) {
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (type.equalsIgnoreCase("SQUARE")) {
      return new Square();
    } else if (type.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    return null;
  }
}
