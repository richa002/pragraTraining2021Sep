public class InheritenceDemo {
    public static void main(String[] args) {

      //  Person p = new Person();
       Person p = new Student("RICHA","LUTHRA","LPS");
       p = new X();
        ((X)p).sayHello();





    }
}

class Person{
  private   String firstName;
  private  String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        System.out.println("Person class constructor called");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void eat(){
        System.out.println("person is eating");
    }
}


class Student extends Person{
   private  String schoolName;


    public Student() {
        super();
        System.out.println("student class constructor called");
    }

    public Student(String firstName, String lastName, String schoolName) {
        super(firstName, lastName);
        this.schoolName = schoolName;
    }

    public Student(String schoolName) {
       // super();
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }




    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println("student studying");
    }
}

class X extends Person
{
    public void sayHello(){
        System.out.println("hi");
    }
}






