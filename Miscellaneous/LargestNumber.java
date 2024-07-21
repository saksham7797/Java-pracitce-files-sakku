
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Total no of Inputs: ");
            int num = scan.nextInt();
            int b, max;
            b = max = 1;
            while( b <= num ){
                System.out.print("Enter the number: ");
                int c = scan.nextInt();
                b++;
                max = Math.max(c,max);
            }
            System.out.println("The maximum number is: " + max);
        }
    }

}
    

