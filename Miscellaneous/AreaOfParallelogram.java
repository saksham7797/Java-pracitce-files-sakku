import java.util.*;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the base:");
            double base = scan.nextDouble();

            System.out.print("Enter the height: ");
            double height = scan.nextDouble();

            double area  = base*height;
            System.out.println("The area of the parallelogram is: " + area);

        }
    }
}
