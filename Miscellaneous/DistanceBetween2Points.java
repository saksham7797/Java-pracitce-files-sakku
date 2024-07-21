import java.util.*;
public class DistanceBetween2Points {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the Initial point's x-coordinate: ");
            double firstX = scan.nextDouble();

            System.out.print("Enter the Initial point's y-coordinate: ");
            double firstY = scan.nextDouble();

            System.out.print("Enter the Final point's x-coordinate: ");
            double secondX = scan.nextDouble();

            System.out.print("Enter the Final point's y-coordinate: ");
            double secondY = scan.nextDouble();

            double one = secondX - firstX;

            double two = secondY- firstY;

            double res = one*one + two*two;

            System.out.println("The distance between two points is: "+res + " units.");



        }
    }
}
