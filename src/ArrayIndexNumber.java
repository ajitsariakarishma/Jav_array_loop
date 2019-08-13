//This program is to check whether the entered number is present in array or not

import java.util.Scanner;


public class ArrayIndexNumber {


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] a = {8, 90, 7, 10, 9, 10, 68, 54, 82, 87};
        System.out.print("enter number to be searched :");
        int d = scanner.nextInt();// user enters number
        boolean ans = false;


        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == d) {
                ans = true;      // saving the value in boolean variable
                j = i;          // saving the position of matched index in int j
                System.out.println("Number is present in array at index no " + j);
            }


        }
        if (ans == false) {
            System.out.println("number is not present in array");
        }
    }
}







