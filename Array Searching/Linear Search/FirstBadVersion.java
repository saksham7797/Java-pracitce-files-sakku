import java.util.*;
public class FirstBadVersion{
    public static void main(String[] args) {
        int bad;
        int[] arr;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the first bad version: ");
            bad = scan.nextInt();
            System.out.println("Enter the no fo versions: ");
            int ver = scan.nextInt();
            arr = new int[ver];
            System.out.println("Enter the versions sequentially");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
        }
        System.out.println("The versions are: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(badVersion(arr, bad));
    }

    static boolean badVersion(int[] arr, int bad){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == bad){
                return true;
            }
        }
        return false;
    }
}