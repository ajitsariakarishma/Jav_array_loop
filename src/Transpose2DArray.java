//This program is to transpose the array,i.e rows become columns and columns becomes rows
public class Transpose2DArray {

    public static void main(String[] args){
        int arr [][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("matrix before transpose");
        for (int i=0;i<3;i++){//outer loop is for rows
            for (int j =0;j<3;j++){// inner loop for columns
                System.out.print(arr[i][j]+ " ");// printing rows and columns
            }
            System.out.println();//printing new line for clear matrix
        }

        System.out.println("matrix after transpose");
        for (int i=0;i<3;i++){// outer loop for rows
            for (int j =0;j<3;j++){//inner loop for columns
                System.out.print(arr[j][i]+ " ");//printing columns as rows and visa versa
            }
            System.out.println();// printing new line for clear understanding
        }

    }
}
