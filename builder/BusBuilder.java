package Builder;

public class BusBuilder extends VehicleBuilder {
  // Hold the instance of the bus
  Bus bus;

  // When this object is instantiated, a new car is created
  public BusBuilder() {
    bus = new Bus();
  }

  @Override
  public void buildName() {
    System.out.println("Setting name");
    bus.setName("Bus");
  }

  // Building Tyres
  @Override
  public void buildTyres() {
    System.out.println("Building tyres for the bus");
    bus.setTyres("4");
  }

  // Building Engine
  @Override
  public void buildEngine() {
    System.out.println("Building engine for a bus");
    bus.setEngine("Diesel engine");
  }

  // Building Chassis
  @Override
  public void buildChassis() {
    System.out.println("Building chassis for the bus");
    bus.setChassis("AEC Reliance");
  }

  // Building Body
  @Override
  public void buildBody() {
    System.out.println("Building body for a bus");
    bus.setBody("Bus Body");
  }

  // Returning the Vehicle Details
  @Override
  public String getVehicle() {
    return bus.getName() + " " + bus.getTyres() + " " + bus.getEngine() + " " + bus.getChassis() + " " + bus.getBody();
  }
}
