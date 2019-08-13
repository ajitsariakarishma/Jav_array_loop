//this program is to calculate and print fibbonacci series where exit criteria is decided by the user
//fibonacci series is the sum of previous two numbers
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number limit for fibbonacci series: ");
        int n = scanner.nextInt();//stroring user input in a integer variable
        int num1 = 0;// the first number in series is 1 hence previous number would be 0
        int num2 = 1;// first numb er of the series to be added with next
        for (int i = 0; i < n; i++) {//iterations according to user input
            if (i == 1) {// checking condition if user enters 1
                System.out.print("  "+num1+"  ");

            } else {// and if its not 1
                int sum = num1 + num2;// add numbers and store answer in a variable sum
                System.out.print( "  "+sum + "  ");// printing value
                num1 = num2;// replacing 1st number by 2nd
                num2 = sum;// replacing second number by sum of previous two numbers
            }

        }
    }
}















