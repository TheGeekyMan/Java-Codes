/**
 *                  1(A)
 *                  !
 * ----------------------------------------
 * !                                      !
 * 2(B)                                   3(C)
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
class C extends A{
    void methodC()
    {   
        System.out.println("i am in C");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        C c1= new C();
        c1.methodA();
        //c1.methodB(); // this will throw error because there is no any relation between class B and class C
        c1.methodC();
    }
    
}
