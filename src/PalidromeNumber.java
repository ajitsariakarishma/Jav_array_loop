//This program is taking user input and displaying if number is palidrome or not.
// Palidrome number is reverse of the number is same as number entered
//example reverse of 212 is also 212 hence it is palidrome
import java.util.Scanner;

public class PalidromeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any multidigit number :");//helps user to enter number as per requirement
        int num = scanner.nextInt();
        int rem = 0;
        int result = 0;
       int palnum = num;


        while (num > 0) {
            //Example number is 35
            rem = num % 10;//take the last digit of the number eg: 35/10=3 quotient and 5 is remainder
            result = result * 10 + rem;// last digit multiplied by 10 eg 0*10+3=30
            num = num / 10;// number becomes 3// order of numbers change as place value changes.

        }
        //comparing number reverse with number entered.
        if(result==palnum){
            System.out.println(result+ " is a palidrome number ");
        }else {
            System.out.println(result+ " is not a palidrome number ");
        }


    }
}
