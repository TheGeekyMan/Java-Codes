import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        int number,fact=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        for(int i=1;i<=number;i++){
            fact = fact * i;
        }
        System.out.print("Factorial is : " + fact);
    }
}
