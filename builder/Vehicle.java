package Builder;

public abstract class Vehicle {
  // Name
  public abstract String getName();

  public abstract void setName(String name);

  // Tyres
  public abstract String getTyres();

  public abstract void setTyres(String tyres);

  // Engine
  public abstract String getEngine();

  public abstract void setEngine(String engine);

  // Chassis
  public abstract String getChassis();

  public abstract void setChassis(String chassis);

  // Body
  public abstract String getBody();

  public abstract void setBody(String body);
}
