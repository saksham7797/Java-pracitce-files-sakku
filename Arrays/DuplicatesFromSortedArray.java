import java.util.*;
public class DuplicatesFromSortedArray {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of Array: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            ArrayList<Integer> arr1 = new ArrayList<>(4);


            System.out.println("Enter the input for array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println();
            System.out.println("The Sorted array is: ");
            System.out.println(Arrays.toString(arr));



            for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
                if(arr[i] == arr[j]){
                    arr[j]++;
                    arr1.add(arr[i]);
                }
            }

            System.out.println();
            System.out.println("The Array with Unique numbers is: ");
            System.out.println(arr1);
        }
    }
}
