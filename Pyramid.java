import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        size = sc.nextInt();

        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //reverse of pyramid

        //System.out.println("This is reverse of pyramid: ");

        for(int i=size;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
