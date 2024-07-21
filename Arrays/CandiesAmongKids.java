import java.util.*;
public class CandiesAmongKids {
    public static void main(String[] args) {

        func(); //Function named func is called to perform the program.
    }

    static void func(){
        
        int[] candy; //Array is defined to have candies.

        int extra; //Integer data type is defined to store the no of extra candies you have.

        try (Scanner scan = new Scanner(System.in)) {


            System.out.print("Enter the no of kids: "); //User is asked to give the number of kids
            candy = new int[scan.nextInt()];              //using scanner class.


            System.out.print("Enter the extra candies: ");//User is aksed to give the no of extra candies.
            extra = scan.nextInt();


            System.out.println();//extra line is added to give space in output window.

            //Loop is used to add the no of candies each kid have.
            for (int i = 0; i < candy.length; i++) {
                System.out.print("Enter the no of candies each kid have: ");
                candy[i] = scan.nextInt();
            }
        }

        System.out.println();//extra line is added to give space in output window.
        
        System.out.println(Arrays.toString(candy));//Candy array is printed.
        
        System.out.println();//extra line is added to give space in output window.


        int temp, a = 0, b = 0;//Some of varibles is defined to calculate the maximum nof candies kid have.

        //Loop for calculating the max no of candies a kid have.
        for (int i = 0; i < candy.length; i++) {
            temp = extra + candy[i];
            b = Math.max(temp, a); 
            a = b;
        }

        int c = b - extra; //Extra variable is used so that error does not reflects.
        System.out.println("The maximum number of candies with kid are: " + c); //Final output.
    }

}
