import org.junit.jupiter.api.Test;

class PersonTest {

  @Test
  void test() {
    Student student1 = new Student("Test Student");
    System.out.println(student1.toString());

    Person p1 = new Person("Test Person");
    System.out.println(p1.toString());

    Employee e1 = new Employee("Test Employee");
    System.out.println(e1.toString());

    Faculty f1 = new Faculty("Test Faculty");
    System.out.println(f1.toString());

    Staff s1 = new Staff("Test Staff");
    System.out.println(s1.toString());
  }

}
