import java.util.*;
public class PalindromeByFunctions {
    public static void main(String[] args) {
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            number = scan.nextInt();
        }
        if(fun(number) == number){
            System.out.println("The number is palindrome.");
        }else{
            System.out.println("The nUmber is not palindrome.");
        }
    }

    static int fun(int num){
        int rev =0, temp;
        while(num != 0){
            temp = num % 10;
            rev = rev*10 + temp;
            num= num/10;
            
            
            
        }return rev;
    }

}
