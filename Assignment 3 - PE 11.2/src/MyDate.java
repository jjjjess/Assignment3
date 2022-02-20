// ******************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Class Description: provided on canvas -
// creates object for date hired.
// ******************************************

class MyDate {
  private int year;
  private int month;
  private int day;

  MyDate() {

  }

  MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public String toString() {
    return month + " " + day + " " + year;
  }

}
