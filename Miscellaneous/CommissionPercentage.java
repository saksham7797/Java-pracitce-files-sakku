import java.util.*;
public class CommissionPercentage{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the commission rate: ");
            double rate = scan.nextDouble();

            System.out.print("Enter the Total sales amount: ");
            double amount = scan.nextDouble();

            double commission = rate*amount/100;

            double percent = commission*100/amount;
            System.out.println("The commission percentage is: " + percent + " %");

        }
    }
}