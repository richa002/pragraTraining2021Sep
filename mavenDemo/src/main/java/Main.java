public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//
//        Dog dog = new Dog();
//
//        Cat cat = new Cat();


       // Animal animal = new Animal();

       Animal animal = new Dog();

        animal = new Cat();









    }

}

class Animal{
    public void makeSound(){
        System.out.println("animal sounds");
    }
}

class Dog extends Animal{
   public void bark(){
       System.out.println("bark");
   }
}
class Cat extends Animal {
    public void mew() {
        System.out.println("mew");
    }
}

