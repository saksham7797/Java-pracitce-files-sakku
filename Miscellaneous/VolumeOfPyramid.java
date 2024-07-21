import java.util.*;
public class VolumeOfPyramid{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
             System.out.print("Enter the base length: ");
             double base1 = scan.nextDouble();

             System.out.print("Enter the base breadth: ");
             double base2 = scan.nextDouble();

            System.out.print("Enter the height of Pyramid: ");
            double hei = scan.nextDouble();

            System.out.println("The Volume of pyramid is: " + base1*base2*hei/3);

        }
    }
}