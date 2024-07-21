import java.util.*;
public class ShuffleTheArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner class to take data from user.
        
        System.out.println();

        while(true){

            // User is asked to give the length of the array.
            System.out.print("Enter the length of Array: ");
            int m = scan.nextInt();
        

            int[] arr = new int[m];

            // Inputs are being taken.
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the inputs: ");
                arr[i] = scan.nextInt();
            }
            scan.close(); // Scanner class is closed to prevent scanner leak. 

            System.out.println("The original array is: " + Arrays.toString(arr));
            
            // Function is being called named Shuffle to shuffle the array.
            shuffle(arr);

            // New array is created to make the While loop defined.
            int[] arr1 = new int[m];
            arr = arr1;// Value is being replaced.
            
        }

    }

    static void shuffle(int[] arr){

        // program for shuffling by permutations.
        for (int i = 0; i < arr.length; i++) {


            if(arr.length > 2){//for those who have value above than 2.
                for (int j = 0; j < i; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }else{
                for (int j = 0; j < i;) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    break;
                }
            }
        }System.out.println("The shuffled array is: " + Arrays.toString(arr));
    }

}