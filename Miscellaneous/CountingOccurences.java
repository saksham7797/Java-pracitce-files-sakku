
import java.util.*;
public class CountingOccurences {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter the Number: ");

            if (scan.hasNextLong()){
                long occur = scan.nextLong();
                System.out.println(" ");
                
                long o = occur;

                System.out.print("Enter the number to search:");
                int num = scan.nextInt();
                
                int count = 0;
                while(occur>0){
                    long rem;
                    rem = occur % 10;
                    if (num == rem){
                        count++;
                    }occur = occur/10;
                }
                System.out.println("The number " + num + " is occured in digit " + o + " is "+ count);

                
            }else{
                System.out.println("Invalid input, Please Enter a valid input: ");
            }
        }
    }
}