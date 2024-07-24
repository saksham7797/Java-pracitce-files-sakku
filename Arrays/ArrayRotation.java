import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the length of array: ");
            int m = scan.nextInt();

            int[] arr = new int[m];
            int[] arr1 = new int[m];

            rotate(arr, arr1);
        }
        
    }

    static void input(int[] arr, int[] arr1){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the inputs for array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr1[i] = scan.nextInt();
            }
        }

        System.out.println("The Initial array is: " + Arrays.toString(arr));

    }

    static void rotate(int[] arr, int[] arr1){
        input(arr, arr1);

        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the no of rotations you want: ");
            n = scan.nextInt();
        }

        if(n > 0){
            for (int i = 0; i < n; i++) {
                for (int j = 1, k = 0; k < arr.length-1; j++, k++) {
                    arr[k] = arr1[j];
                    if( j >= arr.length-1){
                        arr[j] = arr1[0];
                    }
                }
                
                System.arraycopy(arr, 0, arr1, 0, arr1.length);
            }
        }
        

        System.out.println("The Rotated array is: " + Arrays.toString(arr));
    }
}
