import java.util.*;
public class MaxSubarray {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of array: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println(Arrays.toString(arr));


            int maxvalue = Integer.MIN_VALUE;
            int current = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                current = current + arr[i];
                if(current > maxvalue ){
                    maxvalue = current;
                }
                if(current < 0){
                    current = 0;
                }
                max = Math.max(maxvalue, current);

                
            }System.out.println(max);
        }

    }
}
