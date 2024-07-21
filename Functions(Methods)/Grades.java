import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scan.nextLine();
        System.out.print("Enter the Marks you scored(Out of 100) : ");
        double number = scan.nextDouble();
        scan.close();
        System.out.println("Mr./Ms./Mrs. " + name + " Your Grade to respective marks is: " + grade(number));
    }

    static String grade(double num){
        if(num >= 91 && num <= 100){
            return "AA";
        }else if(num >= 81 && num <= 90){
            return "AB";
        }else if(num >= 71 && num <= 80){
            return "BB";
        }else if(num >= 61 && num <= 70){
            return "BC";
        }else if(num >= 51 && num <= 60){
            return "CD";
        }else if(num >= 61 && num <= 50){
            return "DD";
        }else{
            return "FAIL";
        }
    }
}

