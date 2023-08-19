package Builder;

public class CarBuilder extends VehicleBuilder {
  // Hold the instance of the car
  Car car;

  // When this object is instantiated, a new car is created
  public CarBuilder() {
    car = new Car();
  }

  @Override
  public void buildName() {
    System.out.println("Setting name");
    car.setName("Car");
  }

  // Building Tyres
  @Override
  public void buildTyres() {
    System.out.println("Building tyres for a car");
    car.setTyres("4");
  }

  // Building Engine
  @Override
  public void buildEngine() {
    System.out.println("Building engine for a car");
    car.setEngine("Electric Motor");
  }

  // Building Chassis
  @Override
  public void buildChassis() {
    System.out.println("Building chassis for a car");
    car.setChassis("Monocoque");
  }

  // Building Body
  @Override
  public void buildBody() {
    System.out.println("Building body for a car");
    car.setBody("Car Body");
  }

  // Returning the Vehicle Details
  @Override
  public String getVehicle() {
    return car.getName() + " " + car.getTyres() + " " + car.getEngine() + " " + car.getChassis() + " " + car.getBody();
  }
}
