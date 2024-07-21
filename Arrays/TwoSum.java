import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of list: ");
            int n = scan.nextInt();

            int[] nums = new int[n];


            System.out.print("Enter the target integer: ");
            int target = scan.nextInt();

            function(nums, target);
        }

    }

    static void function(int[] nums, int target){
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Enter the elment for " + (i+1) + " index: ");
                nums[i] = scan.nextInt();
            }
        }

        int[] k = new int [2];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    k[a] = nums[i];
                    k[a+1] = nums[j];
                }
            }
        }System.out.println("The final array is: " + Arrays.toString(k));
    }
}
