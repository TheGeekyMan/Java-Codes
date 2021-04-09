import java.util.*;

public class Prime {

    public static void main(String args[]){

        int number;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        for(int i=2;i<=number/2;i++)
        {
            //condition for noonprime   
            if(number % i == 0){
                flag = true;
                break;
            }
        }
        //if flag is true then number is not prime
        //if flag is true then number is prime
        if(flag == false){
            System.out.print(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is a not prime number.");
        }
    }
    
}
