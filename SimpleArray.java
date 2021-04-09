import java.util.*;

public class SimpleArray {
    
    public static void main(String args[]) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Your array is: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " ");
        }

        
    }
}
