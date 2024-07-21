import java.util.*;
public class VolumeOfCylinder{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the radius of cylinder: ");
            double radi = scan.nextDouble();
            System.out.print("Enter the hieght of cylinder: ");
            double height = scan.nextDouble();
            System.out.println("The volume of cylinder is: " + radi*height*2*3.14 + " cubic units.");
        }
    }
}