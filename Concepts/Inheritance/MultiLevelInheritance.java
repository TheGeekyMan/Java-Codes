/**
 * 1(A)
 * !
 * 2(B)
 * !
 * 3(C)
 */


class A{
    void methodA(){
        System.out.println("I am in A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("I am in B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("I am in C");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodA();
        c1.methodB();
        c1.methodC();
    }
}
