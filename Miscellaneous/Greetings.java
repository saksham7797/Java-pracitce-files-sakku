import java.util.*;
public class Greetings {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println(" ");
            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            System.out.println(" ");
            System.out.println("------------ Namaste, MR./Miss/Mrs. " + name + " ------------");
            System.out.println(" ");
        }
    }
}
