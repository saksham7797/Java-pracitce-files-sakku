import java.util.*;
public class PlusOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
 
        System.out.println("Enter the input in the following array ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = scan.nextInt();
        }


        System.out.print("The initial array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] arr1 = new int[n+1];
        for (int i = n-1; i >= 0; i--, n--) {
            arr[i] = arr[i] + 1;
            if(arr[i] > 9){
                arr[i] = 0;
                if(arr[0] >= 9){
                    arr1[n] = arr[i];
                    arr1[0] = 1;    
                }
            }else{
                break;
            }
            
        }

        System.out.println("The final array is: ");
        if(arr[0] == 9){
            System.out.println(Arrays.toString(arr1));
        }else{
            System.out.println(Arrays.toString(arr));
        }
    }
}
