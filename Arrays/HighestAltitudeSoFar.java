import java.util.*;
public class HighestAltitudeSoFar {
    public static void main(String[] args) {
        int n;
        int[] height;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the no of Checkpoints"); // Basically  length of array is being aked from user. 
            n = scan.nextInt();

            height = new int[n];

            //Loop to take input int the array
            for (int i = 0; i < height.length; i++) {
                height[i] = scan.nextInt();
            }
        }

        int temp = 0, c = 0;
        for (int i = 0; i < n; i++) {
            c = temp;
            temp = temp + height[i];
            
        }System.out.println("The Highest altitude so far is: " + Math.max(temp, c));

    }
}
