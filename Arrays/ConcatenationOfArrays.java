import java.util.*;
public class ConcatenationOfArrays {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the range of First Array: ");
            int[] arr1 = new int[scan.nextInt()]; //Taking range of the array 
            System.out.println();
            System.out.print("Enter the range of Second Array: ");    
            int[] arr2 = new int[scan.nextInt()]; //Taking range of the array

            System.out.println();

            //Taking input in both the arrays

            for (int j = 0; j < arr1.length; j++) { 
                System.out.print("Enter the input for First Array: ");
                arr1[j] = scan.nextInt();
            }
            System.out.println();
            for (int k = 0; k < arr2.length; k++) {
                System.out.print("Enter the input for Second Array: ");
                arr2[k] = scan.nextInt();
            }

            scan.close();
            concat(arr1,arr2); //used function named concat
        }

    }


    static void concat(int[] array1, int[] array2){
        int[] arr1 = new int[array1.length + array2.length]; //made new array with adding the lenght of botth arrays from main function.


        //adding first array elements to the new one for concatenation
        for (int i = 0; i < array1.length; i++) {
            arr1[i] = array1[i];
        }


        //adding second array elements to the new by increasing the index so that further elemnts can be added
        for (int k = 0; k < array2.length; k++) {
            arr1[array1.length + k] = array2[k];
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        
    } 

}
