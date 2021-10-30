import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int a=9;
        Person p = new Person();
        p.setId(1l);
        p.setName("Person1");
        p.setAddress("address1");
        p.setAge(0);
        p.setEmail("email");
        p.setDob(new Date());

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        System.out.println(p.getEmail());
        System.out.println(p.getDob());
    }
}
