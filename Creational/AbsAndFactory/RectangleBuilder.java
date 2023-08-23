package Creational.AbsAndFactory;

public class RectangleBuilder extends ShapeBuilder {
  // Holds the instance of the Rectangle
  Rectangle rectangle;

  // Set the rectangle object passed
  public RectangleBuilder(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  // Draw the rectangle
  @Override
  public void buildShape() {
    rectangle.draw();
  }

  // Fill the color
  @Override
  public void fillColor(Color color) {
    color.fill();
  }

  // Get the name
  @Override
  public String getShape() {
    return rectangle.getName();
  }
}
