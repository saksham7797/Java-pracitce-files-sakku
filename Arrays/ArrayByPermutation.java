import java.io.IOException;
import java.util.*;
public class ArrayByPermutation{
    public static void main(String[] args)throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of array: ");
            int[] arr = new int[scan.nextInt()];// Took length of array within the array
            input(arr);// Taking input in array
            printing(arr);
            permutations(arr);
        }
    
    }
    //Input function to take input in array
    static void input(int[] array){
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < array.length; i++) {//using for loop to iterate over the length of array and add input
                System.out.print("Enter the inputs: ");
                array[i] = scan.nextInt();
            }
        }
    }
    //printing the array to show the inputs we have taken   
    static void printing(int[] arra){
        System.out.println("The array is: " + Arrays.toString(arra));        
    }

    // Function created to print permutations of the original array taken in main function.
    static void permutations(int[] arrays){
        System.out.print("The permutions are: ");
        for (int i = 0; i < arrays.length; i++) { //It iterates over 3 times to make combinations by using length of array.
            
            for (int j = 0; j < i; j++) { // By iterating indexes over the length of array so that none of the element is left.
                int temp = arrays[j];     // we used swaping code to make combinations.
                arrays[j] = arrays[j+1];
                arrays[j+1] = temp;
                System.out.println(Arrays.toString(arrays));
                
            }
        
        }
            for (int i = 0; i < arrays.length; i++) { //same loop as above but running in reverse direction.
                for (int j = i; j > 0; j--) {
                int temp = arrays[j];                 //same code for swapping numbers.
                arrays[j] = arrays[j-1];              //"""""""""""""""""""""""""""""""
                arrays[j-1] = temp;                   //"""""""""""""""""""""""""""""""
                System.out.println(Arrays.toString(arrays));
            }
        
        }
    }
}