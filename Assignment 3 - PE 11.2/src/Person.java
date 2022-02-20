// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: creates 'person' obj
// Parent class of Student and Employee.
// ******************************************

public class Person {
  private String name;
  private String address;
  private String phone;
  private String email;

  Person() {

  }

  public Person(String name) {
    this.name = name;

  }

  public String getName() {
    return name;

  }

  public String getAddress() {
    return address;

  }

  public String getPhone() {
    return phone;

  }

  public String getEmail() {
    return email;

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return "Name: " + getName() + ", " + this.getClass();

  }

  public static void main(String[] args) {
    Student student1 = new Student("Jesse");
    System.out.println(student1.toString());

    Person p1 = new Person("Courtney");
    System.out.println(p1.toString());

    Employee e1 = new Employee("Brad");
    System.out.println(e1.toString());

    Faculty f1 = new Faculty("Kim");
    System.out.println(f1.toString());

    Staff s1 = new Staff("Eric");
    System.out.println(s1.toString());


  }


}
