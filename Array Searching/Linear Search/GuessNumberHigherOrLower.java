import java.util.*;
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        int[] arr;
        int target;
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Enter the no to be guessed: ");
            target = scan.nextInt();
            System.out.println();

            System.out.println("Enter the Start point of the range :");
            int start = scan.nextInt();
            System.out.println();
            
            System.out.println("Enter the End point of the ange: ");
            int end = scan.nextInt();
           
            int count = 0;
            for (int i = start; i <= end; i++) {
                count++;
            }
            
            arr = new int[count];
            
            for (int i = 0; i < end; i++, start++) {
                arr[i] = start;
            }
        }

        
        System.out.println();
        System.out.println("The Range is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        function(arr, target);
    }

    static void function(int[] array, int target){
        if(array.length == 0){
            System.out.println("The range is not defined.");
        }

        boolean value = false;
        int i;
        for (i = 0; i < array.length; i++) {
            if(array[i] == target){
                value = true;
                break;                
            }else{
                value = false;
            }
        }

        if(value == true){
            System.out.println("The point at which the number was found was " + (i+1));
            System.out.println("And the number was " + target);
        }
        else{
            System.out.println("The number is not found in the range.");
        }
    }
}
