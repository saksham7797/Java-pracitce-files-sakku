import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            num = scan.nextInt();
        }
        
        if(function(num) == true){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The num is not prime");
        }
    }

    static boolean function(int number){
        for (int i = 2; i*i <= number ; i++) {
            if(number%i == 0){
                return false;
            }
        }return true;
    } 
}
