import java.util.*;
public class OddEven{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num = scan.nextInt();
            if(num % 2 ==0){
                System.out.println("The number is Even.");
            }else{
                System.out.println("The number is Odd.");
            }
        }
    }
}