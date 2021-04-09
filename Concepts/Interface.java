

/**
 * java does not support multiple inheritance(because....... , diamond problem)
 * 
 *                   1(A)                                  2(B)
 *                   !                                     !
 *                   ---------------------------------------
 *                                       !
 *                                       3(C)
 * so we are using interface here
 */

interface A{
    public void methodeA(); //this  not provides any implementation

      default void display(){ // default method provides implementation and they are bydefault public
         System.out.println("I am in Interface A wihch is executable");
     }
}
interface B{
     default void display(){
        System.out.println("I am in interface B wihch is executable");
    }
}
class C implements A , B{
    public void methodeA(){
        System.out.println("I am in interface A");
    }
    public void display(){//this is not displayed
        System.out.println("Implementaion of multiple inheritance");
    }

    public void show() {
        A.super.display();//The super keyword refers to superclass (parent) objects. It is used to call superclass methods
        B.super.display();//super will decide which method call has to print
    }   
}
public class Interface {
    public static void main(String[] args) {
        C c = new C();
        c.methodeA();
        c.show();

    }   
}
