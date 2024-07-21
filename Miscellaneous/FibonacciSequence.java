import java.util.*;
public class FibonacciSequence {

    public static void main(String[] args) {
        int a = 0;
        int b=1;
        int d = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the term (nth term) you want to get: ");
            int term = scan.nextInt();
            for (int c = 1; c <= term; c++) {
                
                d = a+b;
                a = b;
                b = d;
                
            }System.out.println(d);
        }
        
    }
}
