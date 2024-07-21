import java.util.*;
public class Combinations{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the total no of items: ");
            double n = scan.nextDouble();
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp = i*temp;
            }
            System.out.print("Enter the no of items to be selected: ");
            double r = scan.nextDouble();
            double temp2 = n-r;
            double temp3 = 1;
            double lol;
            for (int j = 1; j <= temp2; j++) {
                temp3 = j*temp3;
            }
            double temp4=1;
            for (int k = 1; k <= r; k++) {
                temp4 = k*temp4;
            }
            lol = temp4*temp3;
            double res = temp / lol;
            System.out.println("The Combinations are " + res);
        }
    }
}
    

