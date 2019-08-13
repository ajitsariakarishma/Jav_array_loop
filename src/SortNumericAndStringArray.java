import java.util.Arrays;
import java.util.Scanner;
// this program is to sort string and number array by taking user input
public class SortNumericAndStringArray {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        sortnumber();
        sortstrings();
    }




    public static void sortnumber()
    {

        int[] a = new int[5];
        System.out.println("you are required to enter 5 numbers one by one");
         for(int i=0;i<a.length;i++) {
             System.out.print("Enter  number : ");
             a[i] = scanner.nextInt();  // user inputs string on the first column
         }

        Arrays.sort(a); //  JVM sorts values by inbuilt method
        //asking JVM to convert the sorted values to integers and print
        System.out.println("Numbers arranged in acsending order are  : " + Arrays.toString(a));
    }
    public static void sortstrings(){
        String name[] = new String[5]; //declaring array
        System.out.println("you are required to enter 5 strings/names one by one");
        for(int i =0;i<5.;i++) {
            System.out.print("Enter  name one by one : ");
            name[i] = scanner.nextLine();  // user inputs string on the first column
        }
            Arrays.sort(name); //  JVM sorts strings by inbuilt method
            //asking JVM to convert the sorted values to string and print
            System.out.println("Alphabetically arranged names are  : " + Arrays.toString(name));

    }

    }





