import java.util.*;
public class LeapYear{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println(" ");
            System.out.print("Enter the Year: ");
            int year = scan.nextInt();
            System.out.println(" ");
            int s = year%2;
            if ( s == 0){
                System.out.println("The Year is Leap Year.");
                System.out.println(" ");
            }else{
                System.out.println("The Year is not a Leap Year.");
                System.out.println(" ");
            }
        }
    }
}