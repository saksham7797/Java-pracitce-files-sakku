import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num1 = scan.nextInt();
            System.out.println(" ");
            System.out.print("Enter the number: ");
            int num2 = scan.nextInt();
            System.out.println(" ");
            int fac, mul1, mul2, lcm;
            mul1 = num1;
            mul2 = num2;
            while(num2 != 0){
                fac = num2;
                num2 = num1 % num2;
                num1 = fac;
            }
            lcm = mul1*mul2 / num1;
            System.out.println("The LCM is: " + lcm);
            System.out.println(" ");
                
            
        }
    }
}                

