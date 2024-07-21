import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            double number = scan.nextDouble();
            even(number);
        }
    }

    static void even(double num){
        if(num%2 == 0){
            System.out.println("The number is Even");

        }else{
            System.out.println("The Number is Odd.");
        }
    }
}
