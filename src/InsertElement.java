
//In this program user can decide value to be entered in array at desired valid position
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];// lenght of array
        System.out.print("Enter a number to be stored in a array : ");
        int b = scanner.nextInt();// storing value to be inserted
        System.out.print("Enter position number(range 0-4) : ");// helps user to make a valid entry
        int c = scanner.nextInt();// storing number of position
        for (int i = 0; i < a.length; i++) {// iterations accoring to array lenght
            if (c == i) {// checking if position entered by user matches current position
                a[i] = c;// matched hence changing the current value by user inputed value
                System.out.println("The number " + b + "stored at index position " + c);
            }
        }

        }

    }


