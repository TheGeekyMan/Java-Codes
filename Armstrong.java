    import java.util.*;

    public class Armstrong {

        public static void main(String[] args) {
            int number,temp,rem,sum=0;
            int count = 0;
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

            temp = number;
            //System.out.println(temp);//show the user input,number will be assigned to temp

            //calculating count
            while(number>0){
                number = number / 10;
                count++;
            }//after "number < 0" ; number = 0

            temp = number;

            while(number>0){
                    rem = number % 10;
                    number = number / 10;
                    sum = sum + power(rem,count);
            }

            if(temp == sum){
                System.out.println(temp + " is armstrong number");
            }   
            else{
                System.out.println(temp + " is not armstrong number");
            }
        }
        static int power(int r,int c){
            int p=1;
            for(int i=0;i<=c;i++){
                p = p * r;
            }
            return p;
        }
    }
