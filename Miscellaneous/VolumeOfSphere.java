import java.util.*;
public class VolumeOfSphere{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the radius of Sphere: ");
            double radii= scan.nextDouble();

            System.out.println("The Volume of Sphere is: " + 4*3.14*radii*radii*radii/3 + " cubic units");
        }
    }
}