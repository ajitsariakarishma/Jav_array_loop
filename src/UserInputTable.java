//This program prints a multiplication table as per his/her choice
import java.util.Scanner;

public class UserInputTable {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for multiplication table : ");
        int num1 = scanner.nextInt();// storing user input for multiplication table
        System.out.print("Enter number  for range of the table : ");
        int num2 = scanner.nextInt();// storing exit criteria decided by user
        int product = 1;// initial initialisation for product which cannot be 0
        System.out.println();// printing new line
        for(int i=0;i<=num2;i++ ){// setting no of loops till exit criteria
            product = num1*i;// re initialising product
            System.out.println(num1 +" x " +i+ " = "+ product);// printing table
        }

    }
}
