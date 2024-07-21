import java.util.*;
public class AreaOfEqTriangle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the side of Equalateral Triangle:");
            double side = scan.nextDouble();
            System.out.println("The area of the euqilateral triangle is: " + Math.sqrt(3)*side*side/4);
        }
    }
}
