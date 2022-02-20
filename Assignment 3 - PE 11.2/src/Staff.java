// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: Gets and Sets Title
// ******************************************

public class Staff extends Employee {

  private String title;

  Staff() {

  }

  Staff(String name) {
    super(name);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle() {
    this.title = title;
  }

  public String toString() {
    return "Name: " + getName() + ", " + this.getClass();

  }

}
