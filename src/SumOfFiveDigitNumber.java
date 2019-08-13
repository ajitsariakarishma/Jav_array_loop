//This is a program to get a number by user and sum the digit s of the number and print the answer
import java.util.Scanner;

public class SumOfFiveDigitNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any multidigit number :");
        int num = scanner.nextInt();// storing user input
        int rem = 0;
        int sum = 0;
        while(num>0) {//setting the loop according to the number of digits entered
            rem = num % 10;// extracting last digit from the number
            sum = sum + rem;// adding the value of last digit to a integer variable
            num = num / 10;// reducing number by 1 digit
        }
        //printing the sum of digits
        System.out.print(" Sum of numbers is : "+sum);

        }

    }


