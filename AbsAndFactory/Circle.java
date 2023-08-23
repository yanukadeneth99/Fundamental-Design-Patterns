package AbsAndFactory;

class Circle extends Shape {

  // Properties of Circle
  String name;

  // Set the name initially to Circle
  public Circle() {
    name = "Circle";
  }

  // Draw Circle
  @Override
  public void draw() {
    System.out.println("Draw Circle");
  }

  // Get the name
  @Override
  public String getName() {
    return name;
  }

  // Set the name
  @Override
  public void setName(String name) {
    this.name = name;
  }
}
