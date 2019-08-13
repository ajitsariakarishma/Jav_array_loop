import java.util.Scanner;

public class SearchSpecificElement {
    static Scanner scanner = new Scanner(System.in);
//This prigram is to check whether the entered number is present in array or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;// to store the sum of elements
        System.out.print("enter size of array: ");
        int z = scanner.nextInt();// to store size of array eneterd by user
        int a[] = new int[z];     // decalring array according to size decalred by user
        for (int b = 0; b < a.length; b++) {
            System.out.println("Enter number one by one : ");
            int c = scanner.nextInt();// User enters number one by one

        }

                System.out.print("enter any number :");
        int b = scanner.nextInt();// user enters number
        boolean ans=false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == b) {
                ans = true;// saving the value in boolean variable


            }
        }
        if (ans==true){
        System.out.println("Number is present in array at index :");
        }else{ System.out.print("Number is not present in this array.");}
    }


}