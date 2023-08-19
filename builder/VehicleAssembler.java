package Builder;

public class VehicleAssembler {
  // Holding the instance of the builder
  VehicleBuilder builder;

  // When instantiating this class, a builder is passed
  public VehicleAssembler(VehicleBuilder builder) {
    this.builder = builder;
  }

  // Assembling the vehicle
  public void assembleVehicle() {
    builder.buildName();
    builder.buildEngine();
    builder.buildChassis();
    builder.buildTyres();
    builder.buildBody();
  }

  // Getting the Vehicle Details
  public void getVehicle() {
    System.out.println(builder.getVehicle());
  }

}
