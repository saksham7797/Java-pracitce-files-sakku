import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);       

        System.out.print("Enter the no of rows of matrix: ");
        int n = scan.nextInt();

        System.out.print("Enter the no of coulmns of matrix: ");
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the input for matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[] spiral = new int[n*m];
        
        int up, down, left, right, a;
        up = left = 0;
        a = 0;
        down = n-1;
        right = m-1; 

        while(up <= down && left <= right){
            
                for (int i = left; i <= right; i++, a++) {
                    spiral[a] = matrix[up][i];
                }

                up++;

                for (int i = up; i <= down; i++, a++) {
                    spiral[a] = matrix[i][right];          
                }

                right--;
        
        
            if(up <= down){
                for (int i = right; i >= left; i--, a++) {
                    spiral[a] = matrix[down][i];
                }
    
                down--;
            }

            if(left <= right){
                for (int i = down; i >= up ; i--, a++) {
                    spiral[a] = matrix[i][left];
                }
            
                left++;
            }
        }
        

        System.out.println(Arrays.toString(spiral));

    }
}