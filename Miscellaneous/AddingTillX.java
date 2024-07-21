import java.util.*;
public class AddingTillX {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Type YES if you want to add numbers or NO if you don't : ");
            String cancel = scan.nextLine();
            OUTER:
            while (true) {
                switch (cancel) {
                    case "Yes", "yes", "YES" -> {
                        System.out.print("Enter First Number: ");
                        int num1 = scan.nextInt();
                        System.out.print("Enter Second Number: ");
                        int num2 = scan.nextInt();
                        int res = num1 + num2;
                        System.out.println(res);
                    }
                    case "No", "no", "NO" -> {
                        System.out.println("You have exited the program");
                        break OUTER;
                    }
                    default -> {
                        System.out.println("Invalid Input");
                        break OUTER;
                    }
                }
            }
            
        
        }
    }
}
