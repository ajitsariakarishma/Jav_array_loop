//This program enables user input and return number of odd and even numbers in the same
import java.util.Scanner;

public class OddEvenNo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any multidigit digit number :");
        int num = scanner.nextInt();// storing user input
        int rem = 0;


        int odd = 0;
        int even = 0;
        while (num > 0)// setting loop
            rem = num % 10;// extracting last digit of the number
            num = num / 10;// reducing a digit from number
        if (rem % 2 == 0) {// checking condition
            even = even + 1;// increasing count accordingly


        } else {
            odd = odd + 1;
        }

        // printing final count of odds and evens
        System.out.println(" number of even numbers  : " + even);
        System.out.println(" number of odd numbers  : " + odd);


    }
}



