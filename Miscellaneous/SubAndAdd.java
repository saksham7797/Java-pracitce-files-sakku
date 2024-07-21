import java.util.*;
public class SubAndAdd {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner (System.in)){
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter the second number");
            int num2 = scan.nextInt();

            int pro = num1*num2;
            int sum = num1 + num2;
            int result1 = pro-sum;
            int result2 = sum - pro;

            if(pro > sum){
                System.out.println("The result is: " + result1);
            }else{
                System.out.println("the result is: " + result2);
            }
        }
    }
}
