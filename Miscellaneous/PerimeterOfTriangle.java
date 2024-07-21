import java.util.*;
public class PerimeterOfTriangle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the side of triangle: ");
            double side = scan.nextDouble();
            System.out.println("The perimeter of Equilateral triangle is: " + 3*side);
        }
    }
}
