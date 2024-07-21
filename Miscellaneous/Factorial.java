import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner (System.in)){
            System.out.print("Enter the of which you want factorial: ");
            double num = scan.nextDouble();
            double m = 1;
            while(num!=0){
                m = num*m;
                num -=1;

            }System.out.println(m);
        }
    }
}
