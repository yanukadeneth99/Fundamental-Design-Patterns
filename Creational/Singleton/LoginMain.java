class Login {

  // Private Constructor to prevent the instantiation of this class
  private Login() {
    System.out.println("Login Class Created");
  }

  // Private class to create a new instance
  private static final class LoginSingleton {
    private static Login instance = new Login();
  }

  // Returns the singular instance or creates a new one in the first attempt
  public static Login getInstance() {
    return LoginSingleton.instance;
  }

  // If the logins match the user and password, return true, else false
  public boolean validateUser(String user, String password) {
    return user.equals("admin") && password.equals("password");
  }

}

class LoginMain {

  // Main Runtime
  public static void main(String[] args) {

    // Creating two variables of the Login class
    Login login1 = Login.getInstance();
    Login login2 = Login.getInstance();

    // Testing the validateUser method
    System.out.println(login1.validateUser("admin", "password"));
    System.out.println(login2.validateUser("admin", "password"));
    System.out.println(login1.validateUser("notadmin", "not password"));
    System.out.println(login2.validateUser("notadmin", "not password"));
  }
}