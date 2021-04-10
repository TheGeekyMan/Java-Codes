/**
 * An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */
/**
 * They are used to provide some common functionality across a set of related classes while also allowing default method implementations.
 */

abstract class Bank{
    abstract int rateOfInterest();
}

class SBI extends Bank{
    int rateOfInterest(){
        return 7;
    }
}

class PNB extends Bank{
    int rateOfInterest(){
        return 8;
    }
}

class Abstraction{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.rateOfInterest());
        b = new PNB();
        System.out.println(b.rateOfInterest());
        /*Bank b = new Bank();
        System.out.print(b.rateOfInterest());*/ // this will not work here because the class is defined abstract , so we have to create reference variable of bank
        /**
         * reference variable(trainer) contain bits(address of an object) representing a way to get access to an object(horse) and commanding the object(horse) as per given in object’s blueprint(class).

Television remote= new Television();

where Left hand side is the reference variable.

Right side is the object.
         */
    }
}