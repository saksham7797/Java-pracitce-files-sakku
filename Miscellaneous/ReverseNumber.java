

import java.util.*;
public class ReverseNumber{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int num = scan.nextInt();
            int rev = 0;
            while(num!= 0) {
                int s = num %10;
                rev = rev*10 + s;
                num = num/10;
            
            }System.out.println(rev); 
        }

    }
}
        

