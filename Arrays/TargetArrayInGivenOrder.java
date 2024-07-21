import java.util.*;
public class TargetArrayInGivenOrder{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of both arrays: ");
            int n = scan.nextInt();

            int[] one = new int[n];
            int[] two = new int[n];
            int[] three = new int[n+n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the inputs of First array:");
                one[i] = scan.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the inputs of Second array:");
                two[i] = scan.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                three[i] = two[one[i]];
            }System.out.println(Arrays.toString(three));
        }
    }
}