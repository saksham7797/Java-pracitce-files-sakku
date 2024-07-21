import java.util.*;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the side of square: ");
            double side = scan.nextDouble();
            System.out.println("The Perimeter of the Square is: " + 4*side + " units");
        }
    }
}
