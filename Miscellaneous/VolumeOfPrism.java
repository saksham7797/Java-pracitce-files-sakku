import java.util.*;
public class VolumeOfPrism {
    public static void main(String[] args) {
        try(Scanner scan =  new Scanner(System.in)){
            System.out.print("Enter the height of triangle in prism: ");
            double hei = scan.nextDouble();

            System.out.print("Enter the base of triangle: ");
            double base = scan.nextDouble();

            System.out.print("Enter the length of prism: ");
            double len = scan.nextDouble();

            double big = base*hei*0.5;
            System.out.println("The Voulme of the prism is: " + big*len + " cubic units");
        }
    }
}
