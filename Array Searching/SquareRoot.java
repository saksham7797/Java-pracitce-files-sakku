import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of which you want to find out the square root: ");
        int num = scan.nextInt();

        scan.close();

        for (int i = 0; i < num; i++) {
            if(i*i > num){
                System.out.println("The integer square root of " + num + " is: " + (i-1));
                break;
            }
        }
    }
}
