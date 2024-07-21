import java.util.*;
public class RunningSumOFArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //user is asked to enter the length of array
        System.out.print("Enter the length of array: ");
        int[] array = new int[scan.nextInt()];

        scan.close();

        runningSum(array); // function is called
    }

    static void runningSum(int[] arr1){
        Scanner scan = new Scanner(System.in);

        //loop is defined to add elements to the array
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = scan.nextInt();
            scan.close();
        }System.out.println(Arrays.toString(arr1));


        //loop is defined to add the elements to each other
        for (int i = 0; i < arr1.length-1; i++) {
            arr1[i+1] = arr1[i] + arr1[i+1];
        }
        System.out.println(Arrays.toString(arr1));
    }

}
