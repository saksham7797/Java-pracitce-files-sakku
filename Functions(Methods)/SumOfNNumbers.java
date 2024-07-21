import java.util.*;
public class SumOfNNumbers {
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number till where you want to get the sum: ");
            num = scan.nextInt();
        }
        System.out.println("The ans is: " + fun(num));
    }

    static int fun(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
            
        }return sum;
    }
}
