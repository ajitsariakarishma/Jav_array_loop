//This program is to find duplicate integer values in array
import java.util.Scanner;

public class DuplicateValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean ans = false;

        System.out.print("Enter size of array: ");// user decides number of values he/she would like to enter
        int z = scanner.nextInt();// storing value entered in a integer variable
        int a[] = new int[z];// declaring an integer array according to the size given by user
        for (int b = 0; b < a.length; b++) {// setting number of loops according to the size
            System.out.print(" enter number : ");// user inputs the number one by one
            int c = scanner.nextInt();// storing user input
            a[b] = c;// storing index position
            //printing position if required,here not doig so as it is not needed
            // System.out.println(" number "+ c +" is stored in index position " + b);

        }
        for(int i =0;i<a.length;i++){// extracting 1st element to be compared with others
            for (int j=i+1;j<a.length;j++){// extracting next element
                if (a[i]==a[j]&& i!=j){// comparing 1st with 2nd
                    System.out.println("duplicate element is :"+ a[i]);// printing if matched
                    ans = true;// reinitializing boolean variable

                }
            }

            }

        if (ans==false){// no duplicates as ans is still false, checking
        System.out.print(" No duplicates present");//printing message if ans is false after loop ends
        }
    }
}
