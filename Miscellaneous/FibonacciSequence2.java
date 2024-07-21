import java.util.*;
public class FibonacciSequence2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the term you want to get: ");
            int term = scan.nextInt();
            int a=0;
            int b=1;
            int ex = 0;
            for (int i = 0; i < term; i++) {
                ex = a + b;
                a = b;
                b = ex;
            }System.out.println(ex);
        }
    }
}
