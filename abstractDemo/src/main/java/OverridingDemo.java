public class OverridingDemo
{
    public static void main(String[] args) {


        int a=2;
        System.out.println(a);



        Animal obj = new Cat();
        obj.speak();
        System.out.println(obj);


    }
}

class Animal{
    public void eat(){
        System.out.println("Eat");
    }

    public void speak(){
        System.out.println("Animal  sound");
    }

    public void speak(int a){
        System.out.println(a);
    }
}

class Cat extends Animal{
    private String name;

    public void speak() {

        System.out.println("mews");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sleeps(){
        System.out.println("sleeps");
    }




}


class Z extends Cat{
    @Override
    public void speak() {
        System.out.println("z speaks");
    }
}