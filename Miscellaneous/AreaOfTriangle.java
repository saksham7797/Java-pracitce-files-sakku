import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the base of traingle: ");
            double base = scan.nextDouble();
            System.out.println(" ");
            System.out.print("Enter the Height of triangle: ");
            double height = scan.nextDouble();
            double area = 0.5*base*height;
            System.out.println("The area of triangle is: " + area + " square units");
        }
    }
}