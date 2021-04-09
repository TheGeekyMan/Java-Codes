/**
 * 1(ANIMAL)
 * !
 * 2(DOG)
 */

class Animal {
    String Dog;
    public static void eating(){
        System.out.println("All animals love eating");
    }
}
class Dog extends Animal{
    public static void bark(){
        System.out.println("All dogs bark");
    }
}


public class SingleInheritance {
    
    public static void main(String args[]){

        Dog d = new Dog();
        d.eating();
        d.bark();
    }
}
