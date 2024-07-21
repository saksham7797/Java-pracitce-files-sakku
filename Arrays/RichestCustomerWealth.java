import java.util.*;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int[][] arr = new int[2][3]; //took a 2d array with defined rows and coulmns.
            System.out.println();

            //adding elemnts to the array
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print("Enter the wealth: ");
                    arr1[j] = scan.nextInt();
                }
                System.out.println();
            }
            //printing the array for checking
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr1[j] + " ");
                }
                System.out.println();
            }
            
                System.out.println();
        
            valueAdd(arr); //used a function named valueAdd

        }
    }

    static void valueAdd(int[][] arr){
        
        int i,j;
        int tempo = 0;
        // loop defined for add the value of a single array and find the max
        for (i = 0; i < arr.length; i++) {
            int temp = 0;
            for (j = 0; j < arr[i].length; j++) {
                temp = temp +arr[i][j];
                
            }
            
            tempo = Math.max(tempo, temp);
            
            
        }System.out.println("The wealth of the richest man is: " + tempo);    
        
    
    }

}
