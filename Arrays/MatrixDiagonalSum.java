import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter the no of coulmns: ");
        int coulmns = scan.nextInt();

        scan.close();

        int[][] arr = new int[rows][coulmns];

        func(arr);

    }

    static void func(int[][] arr){
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Entries for row " + (i+1) + " is: ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        
        scan.close();

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    temp += arr[i][j];
                }
            }
        }System.out.println("The Primary diagonal sum is: " + temp);

        for (int i = 0; i < arr.length /2 ; i++) {
            int[] sus = arr[i];

            arr[i] = arr[arr.length-1-i];

            arr[arr.length-1-i] = sus;
        }

        int temp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    temp2 += arr[i][j];
                }
            }
        }System.out.println("The Secondary diagonal sum is: " + temp2);
    }
}
