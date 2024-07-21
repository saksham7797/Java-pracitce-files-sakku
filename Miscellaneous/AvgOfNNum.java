import java.util.*;
public class AvgOfNNum{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner (System.in)){
            System.out.print("Enter the total no. of numbers: ");
            double count = scan.nextDouble(), i= 1;
            double temp = 0, avg;
            while(i<=count){
                System.out.println("Enter the number: ");
                double num = scan.nextDouble();
                
                temp = num + temp;
                i++;

            }
            avg = temp/count;
            System.out.println("The Average of the given numbers is: " + avg);
        }
    }
}