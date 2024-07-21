import java.util.*;
public class InterestCalculator {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println(" ");
            System.out.print("Enter the principal amount: ");
            float princ = scan.nextFloat();

            System.out.print("Enter the rate of Interest: ");
            float inte = scan.nextFloat();
            
            System.out.print("Enter the Time period (in Years): ");
            float time = scan.nextFloat();

            float si = princ*inte*time/100;
            System.out.println(" ");
            System.out.println("The Interest is: " + si);
            System.out.println(" ");
            float amount = si + princ;
            System.out.println("The total amount is: " + amount);
            System.out.println(" ");
        }
    }
}
