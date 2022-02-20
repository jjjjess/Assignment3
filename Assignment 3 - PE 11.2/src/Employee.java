// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: Parent class of
// Faculty and Staff.
// ******************************************

public class Employee extends Person {

  private String office;
  private double salary;
  private MyDate dateHired;

  Employee() {

  }

  Employee(String name) {
    super(name);
  }

  public String getOffice() {
    return office;
  }

  public double getSalary() {
    return salary;
  }

  public MyDate getDateHired() {
    return dateHired;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setDateHired(MyDate dateHired) {
    this.dateHired = dateHired;
  }

  public String toString() {
    return "Name: " + getName() + ", " + this.getClass();

  }

}
