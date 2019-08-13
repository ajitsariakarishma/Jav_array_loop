
//This program is to display the number of duplicate strings in a given array
import java.util.Scanner;

public class DuplicateStrings {
    public static void main(String[] args) {


        boolean ans = false;
        //user can also input srings and decide the lenght of the array, in this case is it is hard  coded
        String a[] ={"karishma", "niketa","seema","ishika","karishma","niketa"};//hard coded string array



        for(int i =0;i<a.length;i++){// number of loops set according to the array lenght
            for (int j=i+1;j<a.length;j++){// inner loop to check and compare codition till last element of array.
                if (a[i]==a[j]){// checking values of 1st elemnt with all other left
                    System.out.println("duplicate element is :"+ a[i]);// printing count if match found
                    ans = true;// boolean variable reset


                }
            }
        }
        if (ans==false){// if boolean is still false after loops then no duplicate values found
            System.out.print(" No duplicates present");}// print message accordingly
    }
}


