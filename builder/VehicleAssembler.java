package Builder;

public class VehicleAssembler {
  VehicleBuilder builder;

  public VehicleAssembler(VehicleBuilder builder) {
    this.builder = builder;
  }

  public void assembleVehicle() {
    builder.buildName();
    builder.buildEngine();
    builder.buildChassis();
    builder.buildTyres();
    builder.buildBody();
  }

  public void getVehicle() {
    System.out.println(builder.getVehicle());
  }

}
