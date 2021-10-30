import java.util.Date;

public class Person {
 private long id;
 private  String name;
 private  String address;
 private String email;
 private int age;

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id= id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public Date getDob() {
  return dob;
 }

 public void setDob(Date dob) {
  this.dob = dob;
 }

 @Override
 public String toString() {
  return "Person{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", address='" + address + '\'' +
          ", email='" + email + '\'' +
          ", age=" + age +
          ", dob=" + dob +
          '}';
 }

 private Date dob;
// public void setName(){
//  name="richa";
// }
}
