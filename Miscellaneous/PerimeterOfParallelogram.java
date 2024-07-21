import java.util.*;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the length of parallelogram: ");
            double length = scan.nextDouble();

            System.out.print("Enter the breadth of parallelogram: ");
            double breadth = scan.nextDouble();

            System.out.println("The Perimeter of the parallelogram is: " + 2*(length+breadth) + " units");
        }
    }
}
