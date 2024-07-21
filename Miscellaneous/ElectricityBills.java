import java.util.*;
public class ElectricityBills {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the Power Consumption as per device and add 0 on the place non avialable device: ");
            System.out.println(" ");
            System.out.print("Enter the power consumption of TV : ");
            int tv = scan.nextInt();
            
            System.out.print("Enter the Power consumption of Fridge:");
            int fridge = scan.nextInt();

            System.out.print("Enter the Power consumption of AC:");
            int ac = scan.nextInt();

            System.out.print("Enter the Power consumption of Washing Machine:");
            int wash = scan.nextInt();

            System.out.print("Enter the Power consumption of Cooler:");
            int cooler = scan.nextInt();

            System.out.print("Enter the Power consumption of Fan:");
            int fan = scan.nextInt();

            System.out.print("Enter the Power consumption of Light Bulb:");
            int bulb = scan.nextInt();

            System.out.print("Enter the Power consumption of Water Pump:");
            int pump = scan.nextInt();

            int watt = tv + fridge + ac + fan + cooler + wash + bulb + pump;
            System.out.println( watt*8 ); 


        }
    }
}
