import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number, sum = 0, remainder, temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrime: ");
        number = sc.nextInt();
        temp = number;
        while(number > 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
            if(temp == sum){
                System.out.print("Number is palindrome");
            }
            else{
                System.out.print("Number is not palindrome");
            }
        
    }
    
}
