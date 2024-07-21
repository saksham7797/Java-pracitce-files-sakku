import java.util.*;
public class MatrixRotation {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the no of rows and coulmns in the matrix: ");
            int n = scan.nextInt();

            int[][] arr1 = new int[n][n];
            int[][] arr2 = new int[n][n];
            rotation(arr1, arr2);
        }
    }

    static void input(int[][] arr1, int[][] arr2){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("---------------------------- Enter the input for First matrix. ----------------------------");
            for (int[] arr11 : arr1) {
                for (int j = 0; j < arr1.length; j++) {
                    arr11[j] = scan.nextInt();
                }
            }
   
            System.out.println("---------------------------- Enter the input for Second matrix. ----------------------------");
            for (int[] arr21 : arr2) {
                for (int j = 0; j < arr2.length; j++) {
                    arr21[j] = scan.nextInt();
                }
            }
        }

        
    }

    static void output(int[][] arr1, int[][] arr2){

        System.out.println("The First array is: " );
        for (int[] arr11 : arr1) {
            System.out.println(Arrays.toString(arr11));
        }

        System.out.println("The Second array is: ");
        for (int[] arr21 : arr2) {
            System.out.println(Arrays.toString(arr21));
        }

    }

    static void rotation(int[][] arr1, int[][] arr2){
        input(arr1, arr2);
        output(arr1, arr2);

        while(areMatriceEqual(arr1, arr2) != true){

            for (int i = 0; i < arr1.length; i++) {
                
                for (int j = 0; j < arr1.length; j++) {
                
                    int temp = arr1[i][j];
                    arr1[i][j] = arr2[j][arr1.length-1-i];
                    arr1[j][arr2.length-1-i] = temp;
                     
                }
            }

            if(areMatriceEqual(arr1, arr2) != true){
                System.out.println("The first matrix is: ");
                for (int[] arr11 : arr1) {
                    System.out.println(Arrays.toString(arr11));
                }

                System.out.println("The second matrix is: ");
                for (int[] arr21 : arr2) {
                    System.out.println(Arrays.toString(arr21));
                }
                break;
            }
        }
    }

    static boolean areMatriceEqual(int[][] arr1, int[][] arr2){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }return true;
    }
}
