import java.util.Scanner;

//This program is to print the tab le of 1 to 3 horizontally using do while loop
public class TablesOneToThree {

    public static void main(String[] args){

        int i=1;
        int j;
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number till where you would like multiplication tables: ");
        int a = scanner.nextInt();
        System.out.print("Enter a number for exit criteria of tables:  ");
        int b = scanner.nextInt();


        do{
            j=1;//inner loop multiplication number intialization
            do{
                t=i*j;// storing the value in variable t (Eg: 1(i)*1(j)=1(t))
                System.out.print("  " + t);// Printing value of t
                 j++;//increasing value of j from 1 to 2 and so on till it goes upto 10

            }while(j<=b);{//when j is more than 10 value of i is creased by 1
                System.out.println(""); // Printing a new line before table of 2 starts
                i++;// value of i is 2

             }

        }while(i<=a);// when i is more than 3 loop terminates

    }
}
