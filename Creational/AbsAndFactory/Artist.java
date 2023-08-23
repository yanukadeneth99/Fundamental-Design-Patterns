package Creational.AbsAndFactory;

public class Artist {
  // Hold the builder instance
  ShapeBuilder shapeBuilder;

  // Store the instance variable when it's called
  public Artist(ShapeBuilder shapeBuilder) {
    this.shapeBuilder = shapeBuilder;
  }

  // Construct the shape and fill the color
  public void constructShape() {
    shapeBuilder.buildShape();
    if (shapeBuilder.getShape().equalsIgnoreCase("Rectangle")) {
      shapeBuilder.fillColor(Red.getInstance());
    } else if (shapeBuilder.getShape().equalsIgnoreCase("Circle")) {
      shapeBuilder.fillColor(Green.getInstance());
    }
  }

}
