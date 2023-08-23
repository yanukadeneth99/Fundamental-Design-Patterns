package AbsAndFactory;

class Red extends Color {

  // Fills the color Red
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
