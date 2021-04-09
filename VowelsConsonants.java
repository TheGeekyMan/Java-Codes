import java.util.*;

public class VowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ch ;

        ch = sc.nextLine();
        ch = ch.toLowerCase();
for(int i=0;i<ch.length();i++){
        if(ch.charAt(i) == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i' || ch.charAt(i) == 'o' || ch.charAt(i) == 'u' )
            System.out.println("Vowel is present at " + i + " which is : " + ch.charAt(i));
        else
            System.out.println(ch.charAt(i) + " this is consonant");
}
    }
}