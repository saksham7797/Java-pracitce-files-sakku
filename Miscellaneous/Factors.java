import java.util.*;
public class Factors {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the number: ");
            int num2 = scan.nextInt();
            int i,j;
            

                for (i = 1; i <= num1 / 2 + num1/1; i++) {
                    if (num1 % i == 0){
                        System.out.println(i);
                        
                    }
                }
                System.out.println(" ");



                for (j = 1; j <= num2 / 2 +num2/2; j++) {
                    if(num2 % j == 0){
                        System.out.println(j);
                        
                    }
                }
                System.out.println(" ");                
            
        }
    }
}
