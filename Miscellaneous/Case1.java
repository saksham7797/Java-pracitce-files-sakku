import java.io.IOException;
import java.util.*;
public class Case1 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the month: ");
            String month = scan.nextLine();
            System.out.print("Enter the year: ");
            int year = scan.nextInt();
            System.out.println(" ");
            
            int leap = year%2;
            switch(leap){
                case 0 -> {
                    switch(month.toLowerCase()){
                        case "january","march","may","july","august","october","december" ->System.out.println("Kunal can go out " + 31/2 + " days");
                        case "april","june","september","november"->System.out.println("Kunal can go out " + 30/2  + " days");
                        case "february" -> System.out.println("Kunal can go out " + 29/2 + " days");
                    }
                }
               default -> {
                    switch(month.toLowerCase()){
                        case "january","march","may","july","august","october","december" ->System.out.println("Kunal can go out " + 31/2 + " days");
                        case "april","june","september","november" ->System.out.println("Kunal can go out " + 30/2 + " days");
                        case "february" -> System.out.println("Kunal can go out " + 28/2 + " days");
                        default -> System.out.println("Invalid Month");
                    }
                }    
            }   
        }
    }
}
