import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter the length of array: ");
        // int n = scan.nextInt();

        int[] arr = new int[5];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = scan.nextInt();
        }

        scan.close();

        System.out.println(Arrays.toString(arr));

        boolean value = false;
        
        for (int i = 0; i < arr.length; i++) {
            int n = 0;
            n = Math.max(n,arr[i]);
            if(n >= (arr.length-1)){
                value = true;
                break;
            }
            else{
                value = false;
            }
        }

        if(value == true){
            System.out.println("This is right, I win.");
        }else{
            System.out.println("No babu");
        }


    }
}
