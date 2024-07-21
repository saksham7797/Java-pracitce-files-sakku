import java.util.*;
public class CircumferenceOfCircle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter tha radius of circle: ");
            double radi = scan.nextDouble();
            System.out.println(" The Circumference of cirlcle is: " + radi*3.14*2);
        }
    }
}
