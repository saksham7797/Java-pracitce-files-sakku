import java.util.*;
public class NumbersSmallerThanCurrentOne {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Length of array: ");
            int n = scan.nextInt();

            int[] one = new int[n];

            int[] count = new int[n];
            


            for (int i = 0; i < one.length; i++) {
                one[i] = scan.nextInt();
            }

            for (int i = 0; i < one.length; i++) {
                int temp = 0;
                for (int j = 0; j < one.length; j++) {
                    if(one[i] > one[j]){
                        temp++;
                    }
                }
                count[i] = temp;
            }
               
               
            System.out.println(Arrays.toString(count));
        }
    }
}

