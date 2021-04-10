import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.print(count);
    }
    
}
