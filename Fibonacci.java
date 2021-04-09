import java.util.*;

public class Fibonacci {
    
    public static void main(String args[]) {

        int num1=0,num2=1,num3,upto;//upto is upto th term of fibonacci series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        upto = sc.nextInt();

        System.out.print(num1 + " " + num2 + " ");//num1 is oth erm and num2 is 1st term

        for(int i=2;i<upto;i++){//so here we are starting from third term
            num3 = num1 + num2;

            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        } 
    }
}
