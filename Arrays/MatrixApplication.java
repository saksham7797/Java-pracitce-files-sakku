import java.util.*;
public class MatrixApplication {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) { // Scanner class is used to take input

            System.out.print("Enter the no of rows: ");
            int q = scan.nextInt();

            System.out.print("Enter the no of columns: ");
            int w = scan.nextInt();

            int[][] arr = new int[q][w];
            fun(arr, q, w);
        }

    }

    static void fun(int[][] arr, int q, int w){
        Scanner scan = new Scanner(System.in);
            
            for (int[] temp : arr) {
                System.out.println("The initial array is: " + Arrays.toString(temp));
            }

            System.out.println();

            System.out.print("Enter the no of row you want to have increment: ");
            int n = scan.nextInt();
            
            for (int i = 0; i < w; i++) {
                arr[n][i]++;
            }

            System.out.print("Enter the no of coulmn you want to have increment: ");
            int b = scan.nextInt();

            for (int i = 0; i < q; i++) {
                arr[i][b]++;
            }
            

            for (int[] temp : arr) {
                System.out.println(Arrays.toString(temp));
            }
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    
                    if(arr[i][j] % 2 != 0){
                        temp++;
                    }
                }
            }System.out.println(temp);
    }
}
