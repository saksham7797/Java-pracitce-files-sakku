    import java.util.*;
    public class NumWithevenNum{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            int[] arr = new int[4];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }

            scan.close();

            System.out.println(Arrays.toString(arr));
            int q = 0;
            for (int i = 0; i < arr.length; i++) {
                int n = arr[i];
                int temp = 0;
                while(n / 10 != 0){
                    n = n / 10;
                    temp++;
                }

                if(temp % 2 == 0){
                    q++;
                }
            }System.out.println(q);

        

        }
    }