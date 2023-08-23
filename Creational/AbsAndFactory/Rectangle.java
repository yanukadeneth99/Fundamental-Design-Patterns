package Creational.AbsAndFactory;

class Rectangle extends Shape {

  // Properties of Rectangle
  String name;

  // Set the name initially to Rectangle
  public Rectangle() {
    name = "Rectangle";
  }

  // Draw Rectangle
  @Override
  public void draw() {
    System.out.println("Draw Rectangle");
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
