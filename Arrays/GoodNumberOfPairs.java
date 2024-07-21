
import java.util.Scanner;

public class GoodNumberOfPairs{
    public static void main(String[] args) {
        int temp;
        int[] one;
        int[] two;
        // User is asked to enter the length of array.
        try (Scanner scan = new Scanner(System.in)) {
            // User is asked to enter the length of array.
            System.out.print("Enter the length of arrays: ");
            int n = scan.nextInt();
            temp = 0;
            //Both the arrays are defined.
            one = new int[n];
            two = new int[n];
            //Loop is used to take input from user(in First array).
            for (int i = 0; i < two.length; i++) {
                System.out.print("Enter the input for first array: ");
                one[i] = scan.nextInt();
            }   System.out.println();
            //Loop is used to take input from user(in Second array).
            for (int i = 0; i < two.length; i++) {
                System.out.print("Enter the input for second array: ");
                two[i] = scan.nextInt();
            }   System.out.println();
            //Scanner class is closed.
        }
       
        //Pairs are compared and it prints the no of times pairs are formed.
        for (int i = 0; i < two.length; i++) {
            if(one[i] == two[i]){
                
                temp++;
                System.out.println("The Good number of pairs are: " + temp);
            }else{
                temp += 0;
            }
        }

        
    }
}