import java.util.*;
public class CSAOfCylinder {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the radius of cylinder: ");
            double radi = scan.nextDouble();

            System.out.print("Enter the height of cylinder: ");
            double height = scan.nextDouble();

            System.out.println("The Curved surface area of the cylinder is: " + radi*height*2*3.14 + " square units.");
        }
    }
}
