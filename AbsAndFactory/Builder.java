package AbsAndFactory;

public class Builder {
  public static void main(String[] args) {
    // Attempt 1
    ShapeBuilder rectangleBuilder = new RectangleBuilder(new Rectangle());
    Artist artist = new Artist(rectangleBuilder);
    artist.constructShape();

    // Attempt 2
    ShapeBuilder circleBuilder = new CircleBuilder(new Circle());
    Artist artist2 = new Artist(circleBuilder);
    artist2.constructShape();
  }
}
