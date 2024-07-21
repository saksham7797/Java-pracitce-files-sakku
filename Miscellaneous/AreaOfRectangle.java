import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the length: ");
            double side1 = scan.nextDouble();

            System.out.print("Enter the breadth: ");
            double side2 = scan.nextDouble();

            double area = side1*side2;
            System.out.println("The area of Rectangle is: " + area + " Square units");
        }
    }
}
