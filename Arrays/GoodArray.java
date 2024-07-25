import java.util.*;
public class GoodArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        System.out.println("Enter the input for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The Initial Array is: " + Arrays.toString(arr));


        int a, b, c;
        a = b = c = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                if(arr[i+1] % arr[i] == 0){
                    a = arr[i];
                    break;
                }else{
                    b = 1;
                    break;
                }
            }else if(arr[i+1] < arr[i]){
                if(arr[i] % arr[i+1] == 0){
                    c = arr[i+1];
                    break;
                }else{
                    b = 1;
                }
            }
        }
        System.out.println(Math.max(c, Math.max(a, b)));
    }
}
