//this program is to sum the elements of array where size and elements are entered by user.

import java.util.Scanner;

public class SumOfValues {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
         int sum = 0;// to store the sum of elements
        System.out.print("enter size of array: ");
        int z = scanner.nextInt();// to store size of array eneterd by user
        int a[] = new int[z];     // decalring array according to size decalred by user
        for (int b = 0; b < a.length; b++) {
            System.out.println("Enter number one by one : ");
            int c = scanner.nextInt();// User enters number one by one
             a[b]=c;
            sum= sum+c;

        }

        System.out.print(" The sum of numbers is :"+ sum);

    }
}
