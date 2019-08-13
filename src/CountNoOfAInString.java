//This program is to find the number of a's in a given word/string
import java.util.Scanner;

public class CountNoOfAInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter any name/string :  ");//User enters a string
        String g = scanner.next();// variable g stores string enetred by user
        char []ch=g.toCharArray();//inbuilt function to convert string to character array (ch: array name)
        int i =0;// intitializing variable for count
        for(char b:ch){// for each loop is easy to go through each character in an array
            switch(b){
                case 'a':// checking for a's while going through each character and if match found
                     i++;// then increase the count
                     break;// breaking the loop
            }


        }
        System.out.print("Number of a's  in String are "+i);// printing count of a's





        }







    }



