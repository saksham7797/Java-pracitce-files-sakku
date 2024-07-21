import java.util.*;
public class VotingAge {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            System.out.print("Dear " + name.toUpperCase() +" ");
            age(age);
            

        }
    }

    static void age(int age){
        if(age >= 18){
            System.out.println("You are eligible for voting.");

        }else{
            System.out.println("You are not eligible for voting.");
        }
    }
}
