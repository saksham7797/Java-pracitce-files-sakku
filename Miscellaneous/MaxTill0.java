import java.util.*;
public class MaxTill0{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner (System.in)){
            double temp = 0;
            while(true){
                
                System.out.print("Enter the Number: ");
                double num = scan.nextDouble();

                double res = num + temp;

                temp = res;
                System.out.println(res);
                if(num == 0){
                    System.out.println("---------- You have exited the program ----------");
                    break;
                }

            }
            
        }
    }
}