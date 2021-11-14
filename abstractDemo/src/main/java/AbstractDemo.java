public class AbstractDemo {
    public static void main(String[] args) {


        Bank b = new TDBank();
        b.rateOfInterst();
        b = new MontrealBank();
        b.rateOfInterst();
    }
}


abstract class Bank{

    private String name;
     public void sayHello(){
         System.out.println("hi");
     }

    public abstract void rateOfInterst();

}

class TDBank extends Bank
{

    @Override
    public void rateOfInterst() {
        System.out.println(2.5);
    }
}

class MontrealBank extends Bank{
    @Override
    public void rateOfInterst() {
        System.out.println(4);
    }
}