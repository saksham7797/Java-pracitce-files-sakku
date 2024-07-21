import java.util.*;
public class FactorialByFunctions {
    public static void main(String[] args) {
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Number of which you want factorial: ");
            number = scan.nextInt();
            System.out.print("The factorial of " + number + " is : " + fac(number));
        }
        
    }

    static int fac(int num){
        int temp =1;
        for (int i = num; i >= 1; i--) {
            temp = temp * i;
        }return temp;
    }

}
