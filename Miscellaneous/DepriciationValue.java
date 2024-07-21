import java.util.*;
public class DepriciationValue{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the Amount for which you purchased: ");
            double amount = scan.nextDouble();
            System.out.print("Enter the residual value: ");
            double residue = scan.nextDouble();
            System.out.print("Enter the useful life: ");
            double life = scan.nextDouble();
            double dep = amount- residue/life;
            System.out.println("The Annual Depriciation expense is: " + dep);
        }
    }
}