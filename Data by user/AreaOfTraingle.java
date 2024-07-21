import java.util.*;
public class AreaOfTraingle{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int base, height;
            System.out.println("Enter length of base:");
            base = scan.nextInt();
            System.out.println("Enter length of height:");
            height = scan.nextInt();
            int area = (int)(0.5*base*height);
            System.out.println("The area of the given Triangle is: " + area);
        }

    }
}