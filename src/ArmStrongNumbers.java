//This program is to dertermine if entered number is armstrong or not

import java.util.Scanner;
//sum of cubes of number is ssme as number than number is armstrong
//example say number is 153 so sum of  cubes of 1,5,and 3 is 153
//1+25+27=153 hence this is armstrong

public class ArmStrongNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any mutlidigit number :");
        int num = scanner.nextInt();
        int rem = 0;
        int sum = 0;
        int ans = num;
        while(num>0) {
            rem = num % 10;//taking last digit
            num = num / 10;
            sum = sum + (rem*rem*rem);//doing the cube of the last digit and storing in a variable
        }
        if(ans==sum){
            System.out.print(ans+ " is an Armstrong Number");
        }else{
            System.out.print(ans+ " is not an Armstrong Number");
        }







    }

}
