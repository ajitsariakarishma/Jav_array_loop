// This program prints the list of n(user input) natural numbers and their sum.
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int i,n,sum = 0;// declaring 3 intereger variables and initializing one which will store sum

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number upto the sum you want: ");
          n = scanner.nextInt();// storing user input
          System.out.print("The first "+ n +" natural numbers are: " );//value of i++ will be printed from loop

        for ( i = 1; i <= n; i++) {

           System.out.print(" "+i);// printing the list of natural numbers upto n
            sum = sum + i;// adding numbers one by one and storing the value in a variable

        }

        System.out.println();// printing new blank line
        System.out.print("The sum of natural numbers  upto " + n + " is : " + sum);//printing sum

    }
}

