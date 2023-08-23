package Creational.Builder;

public class BuilderTest {
  public static void main(String[] args) {

    // Testing Car
    VehicleBuilder carBuilder = new CarBuilder();
    VehicleAssembler assembler = new VehicleAssembler(carBuilder);
    assembler.assembleVehicle();
    assembler.getVehicle();

    System.out.println("=====================================");

    // Testing Bus
    VehicleBuilder busBuilder = new BusBuilder();
    VehicleAssembler assembler2 = new VehicleAssembler(busBuilder);
    assembler2.assembleVehicle();
    assembler2.getVehicle();

  }
}
