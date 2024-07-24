import java.util.*;
public class MaxValueOfEquation{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[][] arr = new int[3][2];
        int[][] arr1 = new int[3][2];

        System.out.println("Enter the points: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("The Initial array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        

        for (int i = 0; i < arr1.length; i++) {
            arr1[i][0] = arr[i][0];
            arr1[i][1] = arr[i][1] - arr[i][0];
        }

        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        int a, b, c, d = 0;
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                a = arr[i][1] - arr[i][0];
                b = arr[j][1] + arr[j][0];

                c = a + b;
                d = Math.max(c , d);

            }
            System.out.println(d);
        }

    }
}