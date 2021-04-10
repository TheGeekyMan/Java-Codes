import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1, str2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ebter string 1: ");
        str1 = sc.nextLine();
        int str1L = str1.length();
        System.out.println("Ebter string 2: ");
        str2 = sc.nextLine();
        int str2L = str2.length();

        if (str1.equals(str2)) {
            System.out.println("String matching");
        } else {
            System.out.println("String not matching");
        }
    }
}
