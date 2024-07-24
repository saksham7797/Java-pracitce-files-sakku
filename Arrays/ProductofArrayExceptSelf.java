import java.util.*;
public class ProductofArrayExceptSelf{
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of array: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the inputs for array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            int[] out = new int[n];

            for (int i = 0; i < out.length; i++) {
                out[i] = 1;
            }

            
            for (int i = 0; i < out.length; i++) {
                int temp = 1;
                for (int j = 0; j < arr.length; j++) {
                    temp = arr[j] * temp;
                }
                out[i] = temp/arr[i];
            }
            

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(out));
        }
    }
}