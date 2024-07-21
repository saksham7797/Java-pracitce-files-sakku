import java.util.*;
public class VowelVsConsonants {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the Character: ");
            char character = scan.next().trim().charAt(0);
            switch(character){
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("The Character is a Vowel.");
                default -> System.out.println("The Character is Consonant.");
            }
        }
    }
}
