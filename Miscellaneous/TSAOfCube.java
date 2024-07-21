import java.util.*;
public class TSAOfCube {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter the side of cube: ");
            double side = scan.nextDouble();

            System.out.println("The Total Surface Area of the cube is: " + side*side*6);
        }
    }
}
