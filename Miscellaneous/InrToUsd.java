import java.util.*;
public class InrToUsd {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Type the amount in INR: ");
            double inr = scan.nextFloat();
            double usd = inr*0.012;
            System.out.println("The Amount from Indian Ruppee to American Dollar is: " + usd);
        }
    }
}
