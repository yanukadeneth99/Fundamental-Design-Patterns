package Builder;

public abstract class VehicleBuilder {
  public abstract void buildName();

  public abstract void buildTyres();

  public abstract void buildEngine();

  public abstract void buildChassis();

  public abstract void buildBody();

  public abstract String getVehicle();
}
