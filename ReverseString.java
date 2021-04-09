import java.util.*;

public class ReverseString {
    
    public static void main(String[] args) {

        String original,reversed="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to reverse: ");
        original = sc.nextLine();

        System.out.print("Reversed string is: ");
        int length = original.length();
        for(int i=length-1;i>=0;i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.print(reversed);
    }
}
