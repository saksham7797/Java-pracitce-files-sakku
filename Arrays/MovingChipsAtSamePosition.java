import java.util.*;
public class MovingChipsAtSamePosition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total no of chips: ");
        int n = scan.nextInt();

        int[] chips = new int[n];
        
        System.out.println("Enter the chips sequentially: ");
        for (int i = 0; i < chips.length; i++) {
            chips[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("The chips are: ");
        System.out.println(Arrays.toString(chips));

        int odd = 0, even = 0;
        for (int i = 0; i < chips.length; i++) {
            if(chips[i] % 2 == 0){
                even++;
            }else if(chips[i] % 2 != 0){
                odd++;
            }
        }

        System.out.println();
        System.out.println("The minimum cost is: " + Math.min(even, odd));
    }

}