import java.util.*;
public class BetweenPrime{
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Initial number: ");
            num1 = scan.nextInt();
            System.out.print("Enter the Final number: ");
            num2 = scan.nextInt();
        }

        fun2(num1,num2);
        
    }    

    
    
    static boolean function(int number){
        for (int i = 2; i*i <= number ; i++) {
            if(number%i == 0){
                return false;
            }
            if(number <= 1 ){
                return false;
            }
        }return true;
    }


    static void fun2(int num1, int num2){
        int temp =0;
        for (int i = num1; i <= num2; i++) {
            
            if(i == 1){
                
            }else if(function(i)){
                System.out.print(i + " ");
                temp++;
            }
            
        }
        System.out.println(" ");
        System.out.println("Total number of prime numbers are: " + temp);
    }

}   
