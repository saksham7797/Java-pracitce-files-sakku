import java.util.*;
public class SpiralMatrixIII{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of linear matrix: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the input for 1D Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        System.out.println(Arrays.toString(arr));
        int m = (int)Math.sqrt(n);

        if(n == m*m){
        int[][] array = new int[m][m];

        int a = 0;
        int up, down;
        up = m/2;
        down = m-1;

        for (int i = up; i <= down; i++, a++) {
            array[up][i] = arr[a];
        }
        up--;
        
        for (int i = down; i >= up ; i--, a++) {
            array[down][i] = arr[a];
        }
        down--;

        for (int i = down; i <= down; i++, a++) {
            array[i][up] = arr[a];
        }
        down++;

        for (int i = up; i <= down; i++, a++) {
            array[up][i] = arr[a];
        }
               

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


        }

    }
}