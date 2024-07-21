import java.util.*;
public class VolumeOfCone {
    public static void main(String[] args) {
        try(Scanner scan =  new Scanner(System.in)){
            System.out.print("Enter the radius of cone: ");
            double radi = scan.nextDouble();
            System.out.print("Enter the height of cone: ");
            double hei = scan.nextDouble();
            System.out.println("The Volume of cone is: " + 3.14*radi*radi*hei/0.34 + " cubic units");
        }        
    }
}
