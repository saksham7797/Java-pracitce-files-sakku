import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner (System.in)){
            System.out.print("Enter the word: ");
            String word = scan.nextLine();

            for (int i = word.length()-1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            
        }
    }
}
