import java.util.*;
public class EnchancedLargestNum {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            double temp = 0;
            while(true){
                System.out.print("Enter the number: ");
                double num = scan.nextDouble();
                double largest = Math.max(num, temp);
                temp = num;
                System.out.println("The largest number is: " + largest);
                if(num == 'x' || num == 'X'){
                    System.out.println("----------- You have exited the program -----------");
                    break;
                }
            }
        }
    }
}
