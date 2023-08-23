package Creational.AbsFactory;

import java.util.Optional;

// Main Class that Runs the Project
class AbsFactoryPattern {
  private static final String SHAPE = "SHAPE";
  private static final String CIRCLE = "CIRCLE";
  private static final String RECTANGLE = "RECTANGLE";
  private static final String SQUARE = "SQUARE";

  private static final String COLOR = "COLOR";
  private static final String RED = "RED";
  private static final String GREEN = "GREEN";
  private static final String BLUE = "BLUE";

  // Runtime
  public static void main(String[] args) {
    // Creating a Shape Factory and calling the `draw()`
    AbsFactory shapeFactory = FactoryProducer.getFactory(SHAPE);
    IShape shape = (IShape) shapeFactory.getObject(CIRCLE);
    shape.draw();

    // Testing Two Shapes
    ((IShape) (FactoryProducer.getFactory(SHAPE)).getObject(RECTANGLE)).draw();
    ((IShape) (FactoryProducer.getFactory(SHAPE)).getObject(SQUARE)).draw();

    // Testing the three Color Objects
    ((IColor) (FactoryProducer.getFactory(COLOR)).getObject(RED)).fill();
    ((IColor) (FactoryProducer.getFactory(COLOR)).getObject(GREEN)).fill();
    ((IColor) (FactoryProducer.getFactory(COLOR)).getObject(BLUE)).fill();
  }
}

// The Main Factory Producer which creates either a Shape or Color Factory
// according to the type sent
class FactoryProducer {
  public static AbsFactory getFactory(String choice) {
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

// Abstract Factory which creates the Shape and Color Objects. We use
// `getObject` because they both return two different kinds of objects (Shape
// and Color)
abstract class AbsFactory {
  public abstract Object getObject(String type);
}

// Factory which creates the Shape Objects according to the sent shape
class ShapeFactory extends AbsFactory {
  public IShape getObject(String shape) {
    if (shape == null) {
      return null;
    }
    if (shape.equalsIgnoreCase("CIRCLE")) {
      return Circle.getInstance();
    } else if (shape.equalsIgnoreCase("SQUARE")) {
      return Square.getInstance();
    } else if (shape.equalsIgnoreCase("RECTANGLE")) {
      return Rectangle.getInstance();
    }
    return null;
  }
}

// Factory which creates the Color Objects according to the sent color
class ColorFactory extends AbsFactory {
  public IColor getObject(String color) {
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

// * SHAPE SINGLETON IMPLEMENTATIONS //

// Interface for Shape
interface IShape {
  void draw();
}

// Circle Shape
class Circle implements IShape {
  @Override
  public void draw() {
    System.out.println("Draw Circle");
  }

  // Private Constructor to prevent it being called
  private Circle() {
    System.out.println("Circle Class Created");
  }

  // Create instance privately
  private static final class CircleSingleton {
    private static Circle instance = new Circle();
  }

  // Get Circle Singleton Instance
  public static Circle getInstance() {
    return CircleSingleton.instance;
  }
}

// Square Shape
class Square implements IShape {
  @Override
  public void draw() {
    System.out.println("Draw Square");
  }

  // Private Constructor to prevent it being called
  private Square() {
    System.out.println("Square Class Created");
  }

  // Create instance privately
  private static final class SquareSingleton {
    private static Square instance = new Square();
  }

  // Get Square Singleton Instance
  public static Square getInstance() {
    return SquareSingleton.instance;
  }
}

// Rectangle Shape
class Rectangle implements IShape {
  @Override
  public void draw() {
    System.out.println("Draw Rectangle");
  }

  // Private Constructor to prevent it being called
  private Rectangle() {
    System.out.println("Rectangle Class Created");
  }

  // Create instance privately
  private static final class RectangleSingleton {
    private static Rectangle instance = new Rectangle();
  }

  // Get Rectangle Singleton Instance
  public static Rectangle getInstance() {
    return RectangleSingleton.instance;
  }
}

// * COLOR SINGLETON IMPLEMENTATIONS //

// Interface for Color
interface IColor {
  void fill();
}

// Red Color
class Red implements IColor {
  @Override
  public void fill() {
    System.out.println("Fill Red Color");
  }

  // Private Constructor to prevent it being called
  private Red() {
    System.out.println("Red Class Created");
  }

  // Create instance privately
  private static final class RedSingleton {
    private static Red instance = new Red();
  }

  // Get Red Singleton Instance
  public static Red getInstance() {
    return RedSingleton.instance;
  }
}

// Green Color
class Green implements IColor {
  @Override
  public void fill() {
    System.out.println("Fill Green Color");
  }

  // Private Constructor to prevent it being called
  private Green() {
    System.out.println("Green Class Created");
  }

  // Create instance privately
  private static final class GreenSingleton {
    private static Green instance = new Green();
  }

  // Get Green Singleton Instance
  public static Green getInstance() {
    return GreenSingleton.instance;
  }
}

// Blue Color
class Blue implements IColor {
  @Override
  public void fill() {
    System.out.println("Fill Blue Color");
  }

  // Private Constructor to prevent it being called
  private Blue() {
    System.out.println("Blue Class Created");
  }

  // Create instance privately
  private static final class BlueSingleton {
    private static Blue instance = new Blue();
  }

  // Get Blue Singleton Instance
  public static Blue getInstance() {
    return BlueSingleton.instance;
  }
}
