import java.util.*;
public class AddToArray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            String num = scan.nextLine();
            char[] arr = num.toCharArray();
            System.out.println("The array formed is " + Arrays.toString(arr));

            int n = Integer.parseInt(num);
            System.out.print("Enter the integer you want to add in the original value: ");
            int k = scan.nextInt();

            int a = n + k;
            String str = Integer.toString(a);
            
            char[] ar = str.toCharArray();
            System.out.println("The Final array is " + Arrays.toString(ar));
        } 

    }
}
