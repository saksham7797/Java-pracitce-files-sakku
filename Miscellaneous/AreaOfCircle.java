import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println(" ");
            System.out.print("enter radius of circle: ");
            double radi = scan.nextFloat();
            double area = 3.14*radi*radi;
            System.out.println("The area of circle is: "+ area);
        }
    }
}