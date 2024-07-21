import java.util.*;
public class NUniqueNumbers {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = scan.nextInt();

            int[] arr = new int[n];
            
            function(arr, n);

            System.out.println("The Arrays is " + Arrays.toString(arr));
        }
    }

    static void function(int[] arr, int n){

        for (int i = 1; i <= n/2; i++) { 
            arr[i-1] = i;
            arr[n-i] = -i;
        }
    }
}
