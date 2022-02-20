// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: Gets and sets
// OfficeHour and Rank
// ******************************************

public class Faculty extends Employee {

  private String officeHour;
  private String rank;

  Faculty() {

  }

  Faculty(String name) {
    super(name);
  }

  public String getOfficeHour() {
    return officeHour;
  }

  public String getRank() {
    return rank;
  }

  public void setOfficeHour(String officeHour) {
    this.officeHour = officeHour;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public String toString() {
    return "Name: " + getName() + ", " + this.getClass();

  }

}
