import java.util.*;
public class MaxPopulationYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of entries: ");
        int n = scan.nextInt();

        int[][] arr = new int[n][2];

        System.out.println("Enter the Year of Birth and Year of Death sequentially.");
        System.out.println("For example: birth, death");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Entry " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();

        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            minYear = Math.min(minYear, arr[i][0]);
            maxYear = Math.max(maxYear, arr[i][1]);
        }

        int[] popu = new int[maxYear - minYear + 2];

        for (int i = 0; i < arr.length; i++) {
            popu[arr[i][0] - minYear]++;
            if (arr[i][1] < maxYear) {
                popu[arr[i][1] - minYear + 1]--;
            }
        }

        int current = 0, max = 0, year = 0;
        for (int i = 0; i <= maxYear - minYear; i++) {
            current += popu[i];
            if(current > max){
                max = current;
                year = i + minYear;
            }
        }

        System.out.println("Year with maximum population: " + year);
    }
}
