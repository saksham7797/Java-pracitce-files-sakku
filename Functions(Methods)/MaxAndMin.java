import java.util.*;

public class MaxAndMin{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the First number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the Second number: ");
            double num2 = scan.nextDouble();
            System.out.print("Enter the Third number: ");
            double num3 = scan.nextDouble();
            System.out.println("The Maximun number is: " + max(num1,num2,num3));
            System.out.println("The Minimum number is: " + min(num1,num2,num3));

        }
        
    }

    static double max(double a, double b,double c){
        return Math.max(c, Math.max(a, b));
    }

    static double min(double a,double b , double c){
        return Math.min(c,Math.min(a,b));
    }
}