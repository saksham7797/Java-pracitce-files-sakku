import java.util.Scanner;
public class TrignoSolver{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String ratio;
            System.out.println("Enter the ratio: ");
            ratio = scan.next().toLowerCase();
            double angle, intoRad, radiCos, radiSin, radiTan, radiSec, radiCosec, radiCot;   
            System.out.println("Enter Angle: ");
            angle = scan.nextDouble();
            intoRad = Math.toRadians(angle);
            switch (ratio) {
                case "sin" -> {
                    radiSin = Math.sin(angle);
                    System.out.println("The answer is:" + radiSin);
                }
                case "cos" -> {
                    radiCos = Math.cos(intoRad);
                    System.out .println("The answer is: "+radiCos);
                }
                case "tan" -> {
                    radiTan = Math.tan(intoRad);
                    System.out.println("The answer is: "+radiTan);
                }
                case "cot" -> {
                    radiCot = Math.tan(intoRad);
                    Double cot = 1/radiCot;
                    System.out.println("The answer is: "+ cot);
                }
                case "sec" -> {
                    radiSec = Math.cos(intoRad);
                    Double sec = 1/radiSec;
                    System.out.println("The answer is: "+ sec);
                }
                case "cosec" -> {
                    radiCosec = Math.sin(intoRad);
                    Double cosec = 1/radiCosec;
                    System.out.println("The answer is: "+ cosec);
                }
                default -> {
                }
            }
            
            
        }
        
    }
}
