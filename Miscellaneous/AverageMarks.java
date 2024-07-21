import java.util.*;
public class AverageMarks {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the Total number of subjects: ");
            double total = scan.nextDouble();
            double temp = 0;
            for (int i = 1; i <= total; i++) {
                System.out.print("Enter Marks: ");
                double marks = scan.nextDouble();
                
                temp +=marks;
                
            }System.out.println("The Average is: " +temp/total);
        }
    }
}
