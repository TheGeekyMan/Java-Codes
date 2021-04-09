import java.util.Scanner;

class ListOfEvenOdd{
    public static void main(String[] args){
        int limit;
        System.out.println("Enter the limit that you want to provide:");
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        System.out.print("Even numbers are:");
        for(int i=0;i<=limit;i++){
            //even number
            if(i % 2 == 0)
            /*if you want to print on single line comment println statement */
            System.out.print(i + " " + "|");//on single line
            //System.out.println(i);//on new line
            /**
             * if you want to print even number in front of even number then uncomment above two statemetn and see the magic
             */
        }
        /**
         * if you want to print numbers in the form of table or in front of number then use only single for loop
         */
        System.out.print("\nOdd number are:");
        for(int i=0;i<=limit;i++){
            if(i % 2 != 0)
            System.out.print(i + " "+ "|");
        }
    }
}