import java.util.*;
public class Discount {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the percentage of discount offered: ");
            double discount = scan.nextDouble();
            
            System.out.print("Enter the MRP: ");
            double mrp = scan.nextDouble();

            double dis = mrp * discount/100;

            double price = mrp - dis;
            System.out.println("The disconted price is: "+price);
        }
    }
}
