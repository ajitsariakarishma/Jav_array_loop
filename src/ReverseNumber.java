//This prigram is to allow user to input any multidigit number and print it in reverse order
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any 5 digit number :");//helps user to enter number as per requirement
        int num = scanner.nextInt();
        int rem=0;
        int result=0;


        while(num>0) {
           //Example number is 35
            rem = num % 10;//take the last digit of the number eg: 35/10=3 quotient and 5 is remainder
            result = result * 10+rem;// last digit multiplied by 10 eg 0*10+3=30
            num = num / 10;// number becomes 3// order of numbers change as place value changes.

        }
        System.out.println(" Reversed number  : "+result);





    }




}
