//This program is to print a right angled '@' triangle
import java.util.Scanner;


public class RightAngles
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number of row :");// user inputs no of row
        int a = scanner.nextInt();// no of rows is stored in a integer variable
        //lets say user inputs 5 as no of rows
        for(int i = 1;i<=a;i++){// 1<=5, condition true hence it enters next for loop
            for(int j=1;j<=i;j++){// 1<=1 ,condition is true hence it enters for loop body(colums to start after
                                  //1st row, to form a tringle.
                System.out.print("@");//prints @ once
                //j++ so now j is 2,2<=1 condition not true so comes out of loop
            }

            System.out.println("");//prints a new line
            //i++ so now i=2, 2<=5, true enters the loop again.
            //this time internal loop executes twice as j=1 and i =2 and so on
        }
    }
}
