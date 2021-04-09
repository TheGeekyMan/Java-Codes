import java.util.Scanner;

public class PercentageOfStudent {

    public static void main(String[] args) {

        int size , sum=0;
        System.out.print("Enter the number of subjects:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.print("Enter the marks of student separated by spaces:");
        int a[] = new int[size];//declaration of array
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();//adding elements in array
            sum = sum + a[i];//adding elements of array
        }
        //System.out.print("Sum = " + sum);//displaying sum
        //used this formula because we doesnot know total marks
        float per;
        per = (sum / size) * 100 ;
        per = per / 100;
        System.out.println("Calculated percentage is : " + per); 
    }
}
