// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: Provides 'student' obj
// sets class status (freshman - senior)
// ******************************************

public class Student extends Person {

  // Per assignment: "Define status as a constant"
  public static String freshman = "Freshman";
  public static String sophmore = "Sophmore";
  public static String junior = "Junior";
  public static String senior = "Senior";

  private String status;

  Student() {

  }

  Student(String name) {
    super(name);

  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String name, String status) {
    this.status = status;
  }

  public String toString() {
    return "Name: " + getName() + ", " + this.getClass();

  }



}
