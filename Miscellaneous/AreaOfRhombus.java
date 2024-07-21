import java.util.*;
public class AreaOfRhombus {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter D if you eant to find area by diagonals, else enter Origin: ");
            String str = scan.nextLine();

            if(str.equals("diagonals") ||str.equals("Diagonals")){
                System.out.print("Enter the first Diagonal: ");
                double d1 = scan.nextDouble();
                System.out.print("Enter the second Diagonal: ");
                double d2 = scan.nextDouble();
                System.out.println("The area of rhombus is: " + 0.5*d1*d2);
            }else{
                System.out.print("Enyter the base: ");
                double base = scan.nextDouble();

                System.out.print("Enter the Height: ");
                double height = scan.nextDouble();
                System.out.println("The area of Rhombus is: " + base*height);
            }
        }
    }
}
