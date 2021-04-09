class Animal{
    Animal(){
        System.out.println("All animas eat");
    }
}
class Dog extends Animal{
     Dog(){
        super(); // if you ommit this super then nothings happens ; compliler provides internally super 
        System.out.println("All dogs loves sleeping");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
