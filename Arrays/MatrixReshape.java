import java.util.*;
public class MatrixReshape{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("-------------------------------- Enter 1 if you want to convert a 2D array to 1D array --------------------------------");
            System.out.println();

            System.out.println("-------------------------------- Enter 2 if you want to convert a 1D array to 2D array --------------------------------");
            System.out.print("Enter the following command: ");
            String str = scan.next();

            

            switch(str){
                case "1" ->{

                    System.out.print("Enter the no of rows of matrix: ");
                    int n = scan.nextInt();

                    System.out.print("Enter the no of coulmns of matrix: ");
                    int m = scan.nextInt();

                    int[][] arr = new int[n][m];

                for (int[] arr1 : arr) {
                    for (int j = 0; j < arr.length; j++) {
                        arr1[j] = scan.nextInt();
                    }
                }

                for (int[] arr1 : arr) {
                    System.out.println(Arrays.toString(arr1));
                }

                    int k = 0;
                    int[] arr1 = new int[n*m];
                for (int[] arr2 : arr) {
                    for (int j = 0; j < arr.length; j++) {
                        arr1[k] = arr2[j];
                        k++;
                    }
                }

                    System.out.println(Arrays.toString(arr1));
                }
                case "2" ->{
                    System.out.print("Enter the length of 1D array: ");
                    int l = scan.nextInt();

                    int[] arr = new int[l];

                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = scan.nextInt();
                    }

                    System.out.println(Arrays.toString(arr));
                    int rows = (int) Math.sqrt(l);
                    int cols = (int) Math.ceil((double) l / rows);

                    int[][] arr2 = new int[rows][cols];
                    int q = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols && q < l; j++) {
                            arr2[i][j] = arr[q];
                            q++;
                        }
                    }

                for (int[] arr21 : arr2) {
                    System.out.println(Arrays.toString(arr21));
                }

                    
                }
            }
        }        
    }
}