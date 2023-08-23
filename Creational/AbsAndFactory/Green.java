package Creational.AbsAndFactory;

class Green extends Color {

  // Fills the color Green
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
