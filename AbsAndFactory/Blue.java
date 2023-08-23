package AbsAndFactory;

class Blue extends Color {

  // Fills the color blue
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
