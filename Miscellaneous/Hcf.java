import java.util.*;
public class Hcf {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num1 = scan.nextInt();
            System.out.println(" ");
            System.out.print("Enter the number: ");
            int num2 = scan.nextInt();
            System.out.println(" ");
            int fac;
            
            while(num2 != 0){
                fac = num2;
                num2 = num1 % num2;
                num1 = fac;
            }
            System.out.println("The HCF is: " + num1);
            System.out.println(" ");
                
            
        }
    }
}
