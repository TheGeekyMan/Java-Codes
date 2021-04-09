/**
 *  1.super can be used to refer immediate parent class instance variable.
    2.super can be used to invoke immediate parent class method.
    3.super() can be used to invoke immediate parent class constructor.
 * real time example of super
 */
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id; //passed paramaeters/arguments should be written on right hand side
        this.name = name;
    }
}

class Teacher extends Student{
    float sal;
    Teacher(int id, String name ,float sal){
        super(id,name);//reuisng parent constructor
        this.sal = sal;
    }
    void display(){
        System.out.println("Id is : " + id + " name is : " + name + " and teachers salary is : " + sal);
    }
}
public class RealSuper {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Onkar", 40000);
        t.display();
    }
}
