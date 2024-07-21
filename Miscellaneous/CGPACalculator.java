import java.util.*;
public class CGPACalculator {
    public static void main(String[] args) {
        try(Scanner Scan = new Scanner(System.in)){
            System.out.print("Enter the total number of subjects: ");
            double total = Scan.nextDouble();
            double res = 0;
            for (int i = 1; i <= total; i++) {
                System.out.print("Enter the grade: ");
                double grade = Scan.nextDouble();
                int temp = 0;
                if(grade>=91 && grade<=100){
                    temp = temp + 10;
                }else if(grade>=81 && grade <=90){
                    temp = temp + 9;
                }else if(grade>=71 && grade <=80){
                    temp = temp + 8;
                }else if(grade>=61 && grade <=70){
                    temp = temp + 7;
                }else if(grade>=51 && grade <=60){
                    temp = temp + 6;
                }else if(grade >=0 && grade<=50){
                    temp = temp + 0;
                }
                res = temp +res;
                         
            }System.out.println("Your CGPA is "+res/total + " %");
        }
    }
}
