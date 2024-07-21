import java.util.*;
public class AlphabetCase{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the Character: ");
            char c = scan.next().trim().charAt(0);
            if (c>='a' && c<='z'){
                System.out.println("It is Lowercase");
            }else{
                System.out.println("It is Uppercase");
            }
        }
    }
}