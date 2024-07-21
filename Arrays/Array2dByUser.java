import java.util.*;
public class Array2dByUser {
    public static void main(String[] args){
        int[][] arr;
        // Taking length of rows from user.
        try (Scanner scan = new Scanner(System.in)) {
            // Taking length of rows from user.
            System.out.print("Enter the lenght of rows: ");
            int m = scan.nextInt();
            // Taking length of coulmns from user.
            System.out.print("Enter the length of coulmns: ");
            int n = scan.nextInt();
            // Initialised a 2d array with m rows and n coulmns.
            arr = new int[m][n];
            // Taking input in the 2d array.
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            // Scanner class is closed.
        }

        // Printing the 2d array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        
    }
}
