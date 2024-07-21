import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the no of rows: ");
            int n = scan.nextInt();

            System.out.print("Enter the no of coulmns: ");
            int m = scan.nextInt();

            int[][] arr = new int[n][m];

            function(arr);
        }

    }

    static void input(int[][] arr){
        try (Scanner scan = new Scanner(System.in)) {
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr.length; j++) {
                    arr1[j] = scan.nextInt();
                }
            }
        }
    }

    static void function(int[][] arr){

        input(arr);
        
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i < j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
