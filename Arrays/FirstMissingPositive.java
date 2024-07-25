import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the inputs for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The Initial Matrix is: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                System.out.println("The Smallest positive missing number is: " + (i+1));
                break;
            }
            
        }
    }
}
