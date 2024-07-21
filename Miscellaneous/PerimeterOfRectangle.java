import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the length of Rectangle: ");
            double length = scan.nextDouble();

            System.out.print("Enter the breadth of Rectangle: ");
            double breadth = scan.nextDouble();

            System.out.println("The Perimeter of the Rectangle is: " + 2*(length+breadth) + " units");
        }
    }
}
