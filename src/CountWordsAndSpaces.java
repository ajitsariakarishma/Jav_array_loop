//This program is to count the number of spaces and words in a sentence/string entered by user
import java.util.Scanner;

public class CountWordsAndSpaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence:");
        String sen = scanner.nextLine();// storing user input in a string variable
        char[] temp = sen.toCharArray();// converting string variable to a character array by inbuilt function
        int words = 1;// word count is 1 from start as user would input one word or character
        int spaces = 0;// presence of spaces is not sure hence count begins with 0

        for (int i = 0; i < temp.length; i++) {// setting number of loops to the lenght of sentence including space
            if(temp[i]==' '){// checking space through if condition
                spaces=spaces+1;// if match is found then increasing the count

            }

        }
        words=words+spaces;// number of words would be space + one(as its the standard way of wrinting
        System.out.println("No of spaces in the sentence is : "+spaces);// printing space count
        System.out.println("No of words in the sentence is : "+words);// printing word count


    }
}


