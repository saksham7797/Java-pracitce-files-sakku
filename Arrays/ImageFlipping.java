import java.util.*;
public class ImageFlipping{
    public static void main(String[] args) {
        int[][] arr;
        int[][] ar;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the no of rows: ");
            int n = scan.nextInt();
            System.out.println("Enter the no of coulmns: ");
            int m = scan.nextInt();
            arr = new int[n][m];
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[j] = scan.nextInt();
                }
            }
ar = arr;
        }

        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
        
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-1-i];
                arr[i][arr[i].length-1-i] = temp;
            }         
        }

        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }


        System.out.println();

        for (int i = 0; i < ar.length/2; i++) {
            int[] temp = ar[i];
            ar[i] = ar[arr[i].length-i-1];
            ar[ar[i].length-i-1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }

        
    }
}