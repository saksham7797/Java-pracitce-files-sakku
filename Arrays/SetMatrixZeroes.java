import java.util.*;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of row of matrix: ");
            int n = scan.nextInt();

            System.out.print("Enter the length of coulmn of matrix: ");
            int m = scan.nextInt();
            
            int[][] skibidi = new int[n][m];
            int[][] skibidi2 = new int[n][m];

            System.out.println("Enter the elements for the matrix: ");
            for (int i = 0; i < skibidi.length; i++) {
                for (int j = 0; j < skibidi[i].length; j++) {
                    skibidi[i][j] = skibidi2[i][j] = scan.nextInt();
                }
            }

            for (int[] skibidi1 : skibidi) {
                System.out.println(Arrays.toString(skibidi1));
            }

            for (int i = 0; i < skibidi.length; i++) {
                for (int j = 0; j < skibidi.length; j++) {
                    if(skibidi[i][j] == 0){
                        for (int a = 0; a < skibidi.length; a++) {
                            skibidi[i][a] = 0;
                            skibidi2[a][i] = 0;
                        }
                    }
                }
            }

            for (int i = 0; i < skibidi2.length; i++) {
                for (int j = 0; j < skibidi2.length; j++) {
                    if(skibidi[i][j] != skibidi2[i][j] && skibidi2[i][j] == 0){
                        skibidi[i][j] = skibidi2[i][j];
                    }
                }
            }

            for (int[] skibidi1 : skibidi) {
                System.out.println(Arrays.toString(skibidi1));
            }
        }

    }
}
