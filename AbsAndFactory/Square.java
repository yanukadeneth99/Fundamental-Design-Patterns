package AbsAndFactory;

class Square extends Shape {

  // Properties of the Square
  String name;

  // Set the name initially to Square
  public Square() {
    name = "Square";
  }

  // Draw Square
  @Override
  public void draw() {
    System.out.println("Draw Square");
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
