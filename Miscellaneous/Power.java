import java.util.*;
public class Power {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the base: ");
            double base = scan.nextDouble();

            System.out.print("Enter the exponential value: ");
            double value = scan.nextDouble();

            System.out.println("The Ans is: "+Math.pow(base,value));
        }
    }
}
