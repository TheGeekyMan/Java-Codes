/**
 * program for invoking method of superclass by using super
 */

class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("I am barking");
    }
    void display(){
        super.eat();//eat method is called from parent
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display(); 
        d.bark();
    }
}
