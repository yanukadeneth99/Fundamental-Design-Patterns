package AbsAndFactory;

public class CircleBuilder extends ShapeBuilder {
  // Holds the instance of the Circle
  Circle circle;

  // Set the circle object passed
  public CircleBuilder(Circle circle) {
    this.circle = circle;
  }

  // Draw the shape
  @Override
  public void buildShape() {
    circle.draw();
  }

  // Fill the color
  @Override
  public void fillColor(Color color) {
    color.fill();
  }

  // Get the name
  @Override
  public String getShape() {
    return circle.getName();
  }

}
