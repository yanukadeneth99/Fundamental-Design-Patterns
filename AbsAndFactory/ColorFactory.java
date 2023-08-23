package AbsAndFactory;

// Factory which creates the Color Objects according to the sent color
class ColorFactory extends AbstractFactory {
  public Color getObject(String color) {
    if (color == null) {
      return null;
    }
    if (color.equalsIgnoreCase("RED")) {
      return Red.getInstance();
    } else if (color.equalsIgnoreCase("GREEN")) {
      return Green.getInstance();
    } else if (color.equalsIgnoreCase("BLUE")) {
      return Blue.getInstance();
    }
    return null;
  }
}
