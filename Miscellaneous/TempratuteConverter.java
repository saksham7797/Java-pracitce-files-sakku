

import java.util.*;

public class TempratuteConverter {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("----- Type answers in Yes or No -----");
            System.out.print("Do yu want to convert from ºC to ºF :");
            String str = scan.nextLine();
            System.out.println(" ");
            if("yes".equals(str) || "Yes".equals(str)){
                System.out.print("Enter the value in ºC: ");
                float cel = scan.nextInt();
                System.out.println(" ");
                float faren = (cel*9/5)+32;
                System.out.println("The Farenhiet value of given temprate is: " + faren);
                System.out.println(" ");
            }else if("No".equals(str) || "no".equals(str)){
                System.out.print("Enter value in ºF: ");
                float far = scan.nextFloat();
                System.out.println(" ");
                float celci = (far - 32)*5/9;
                System.out.println("The Celcius value of given temprature is: " + celci);
                System.out.println(" ");
            }else{
                System.out.println("----- Invalid Input, Please Enter a valid input -----");
            }
        }
    }
}
