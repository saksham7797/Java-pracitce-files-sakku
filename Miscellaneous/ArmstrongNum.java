
import java.util.*;
public class ArmstrongNum{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number to check wether it is Armstrong or not: ");
            int num = scan.nextInt();
            int f = num;
            int arm =0;
            while(num != 0 ){
                int s = num%10;
                num = num/10;
                arm += (s*s*s);
            }
            if(arm == f){
                System.out.println("The number is Armstrong.");

            }else{
                System.out.println("The number is not Armstrong");
            }
        }    
    }
}
