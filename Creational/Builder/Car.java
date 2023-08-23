package Creational.Builder;

public class Car extends Vehicle {

  // Properties of the car
  String name;
  String engine;
  String chassis;
  String tyres;
  String body;

  // GETTERS

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getEngine() {
    return engine;
  }

  @Override
  public String getChassis() {
    return chassis;
  }

  @Override
  public String getTyres() {
    return tyres;
  }

  @Override
  public String getBody() {
    return body;
  }

  // SETTERS

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setEngine(String engine) {
    this.engine = engine;
  }

  @Override
  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  @Override
  public void setTyres(String tyres) {
    this.tyres = tyres;
  }

  @Override
  public void setBody(String body) {
    this.body = body;
  }
}
