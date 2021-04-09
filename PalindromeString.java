import java.util.*;

public class PalindromeString {
    
    public static void main(String[] args) {

        String original,reversed="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string or number to check palindrome: ");
        original = sc.nextLine();

        int length = original.length();
        for(int i=length-1;i>=0;i--){
            reversed = reversed + original.charAt(i);
        }

        if(original.equals(reversed)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }  
    }
}
