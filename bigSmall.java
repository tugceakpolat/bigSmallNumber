import java.util.Scanner;
public class bigSmall {
    public static void main(String[] args) {

        int in;
        int number;
        int min =0;
        int max =0;


        Scanner input = new Scanner(System.in);

        System.out.print("How many enter will you number : ");
        in = input.nextInt();

         for(int i = 1; i <= in; i ++ ){
             System.out.print(i + ". number : " );
             number = input.nextInt();
         if ( number == 1) {
             min = number;
             max = number;
         }
         if( number > max){
             max = number;
         }
         if(number < min){
             min = number;
             }

         }

        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);



    }
}
