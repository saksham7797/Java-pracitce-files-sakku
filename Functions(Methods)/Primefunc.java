import java.util.*;
public class Primefunc{
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            num = scan.nextInt();
        }
        if(isprime(num) == true){
            System.out.println("The number is prime.");

        }else{
            System.out.println("The number is not prime.");
        }
        
    }

    static boolean isprime(int number){
        if(number == 1 ){
            return false;
        }else return number %2 != 0;
    }

}