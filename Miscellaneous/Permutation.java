import java.util.*;
public class Permutation{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the total no of items: ");
            double n = scan.nextDouble();
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp = i*temp;
            }
            System.out.print("Enter the no of items to be arranged: ");
            double r = scan.nextDouble();
            double temp2 = n-r;
            double temp3 = 1;
            for (int j = 1; j <= temp2; j++) {
                temp3 = j*temp3;
            }
            double res = temp / temp3;
            System.out.println("The Permutations are " + res);
        }
    }
}