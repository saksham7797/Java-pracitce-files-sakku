import java.util.*;
public class SpiralMatrixII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of matrix: ");
        int n = scan.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the input for the following array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int m = (int)Math.sqrt(n);

        int[][] spiral = new int[m][m];

        for (int i = 0; i < spiral.length; i++) {
            System.out.println(Arrays.toString(spiral[i]));
        }

        int up, left, down, right, a;
        up = left = a = 0;
        down = right = m-1;

        while(up <= down && left <= right){

            for (int i = left; i <= right; i++, a++) {
                spiral[up][i] = array[a];
            }

            up++;

            for (int i = up; i <= down; i++, a++) {
                spiral[i][right] = array[a];
            }
            right--;

            if(up <= down){
                for (int i = right; i >= left ; i--, a++) {
                    spiral[down][i] = array[a];                                
                }
    
                down--;
            }

            if(left <= right){
                for (int i = down; i >= up; i--, a++) {
                    spiral[i][left] = array[a];
                }
    
                left++;
            }

        }

        for (int i = 0; i < spiral.length; i++) {
            System.out.println(Arrays.toString(spiral[i]));
        }

        
    }
}
