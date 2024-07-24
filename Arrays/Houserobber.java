import java.util.*;
public class Houserobber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] house = new int[5];

        System.out.println("Enter the house having corresponding amount sequentially: ");
        for (int i = 0; i < house.length; i++) {
            house[i] = scan.nextInt();
        }

        System.out.println("The Initial array is: " + Arrays.toString(house));

        int q = house[0];
        int w = Math.max(house[0], house[1]);
        int i, j;
        
        for (i = 2; i < house.length; i = i + 2) {
            q = q + house[i];
        }

            
        for (j = 3; j < house.length; j = j + 2) {
            w = w + house[j];
        }

        if(q > w){
            System.out.println("The maximum robbery can be done by houses at index: ");
            for (int j2 = 0; j2 < house.length; j2 = j2 + 2) {
                System.out.println(j2);
            }
        }else if(q < w){
            System.out.println("The maximum robbery can be done by houses at index: ");
            for (int j2 = 0; j2 < house.length; j2++) {
                System.out.println(j2);
            }
        }else{
            System.out.println("Robbery can be done on either of indeces: ");
        }
    }
}