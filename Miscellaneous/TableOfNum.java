import java.util.*;
public class TableOfNum {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                
                System.out.print("Enter which Number's Table you want : ");
                int tab = scan.nextInt();
                System.out.println(" ");
                for (int i = 1; i <= 10; i++) {
                    int l = tab*i;
                    System.out.println(l);
                }
                System.out.println(" ");
                
            }
        }
    }
}
