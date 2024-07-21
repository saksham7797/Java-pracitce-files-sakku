import java.util.*;
public class LuckNumberInMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        fun(arr);
    }
    
    static void input(int[][] arr){
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the elements for row " + (i+1) + " :");
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
        }
    }
    static void fun(int[][] arr){

        input(arr);
        int maxvalue = Integer.MAX_VALUE;
        int minvalue = Integer.MIN_VALUE;

        int m , n;
        for (int i = 0; i < arr.length; i++) {
            n = Math.max(Math.max(arr[2][i], minvalue),Math.max(Math.max(arr[0][i], minvalue),Math.max(arr[1][i], minvalue)));

            for (int[] arr1 : arr) {
                m = Math.min(Math.min(arr1[2], maxvalue), Math.min(Math.min(arr1[0], maxvalue), Math.min(arr1[1], maxvalue)));
                if(m == n){
                    System.out.println("The lucky number is: " + m);
                    break;
                }
            }

            
        }
    }
}
