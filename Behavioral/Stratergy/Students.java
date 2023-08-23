package Behavioral.Stratergy;

abstract public class Students {
  // Holding the Objects of Festival and Programs when created by child classes
  IFestival festival;
  IPrograms program;

  // Compulsory function to implement
  public abstract void displayStudents();

  // Pushing forward the set program's offer program function
  public void offerPrograms() {
    program.offerPrograms();
  }

  // Pushing forward the set festival's perform event function
  public void conductEvents() {
    festival.performEvent();
  }

  // Changing the festival
  public void setFestival(IFestival festival) {
    this.festival = festival;
  }

  // Changing the program
  public void setPrograms(IPrograms program) {
    this.program = program;
  }

}
