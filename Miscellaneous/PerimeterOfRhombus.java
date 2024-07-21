import java.util.*;
public class PerimeterOfRhombus {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the side of rhombus: ");
            double side = scan.nextDouble();
            System.out.println("The Perimeter of the Rhombus is: " + 4*side + " units");
        }
    }
}
