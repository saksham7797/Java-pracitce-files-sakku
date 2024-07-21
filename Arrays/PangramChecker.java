import java.util.*;
public class PangramChecker{
    public static void main(String[] args){
        String str;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the String: ");
            str = scan.nextLine().toLowerCase();
        }

        pang(str);

    }

    static void pang(String a ){
        
        char[] c = a.toCharArray();
        System.out.println(Arrays.toString(c));

        boolean[] tru = new boolean[26];

        for (int i = 0; i < c.length; i++) {
            char d = c[i];
            if(d >= 'a' && d <= 'z'){
                tru[d - 'a'] = true;
            }
        }
        for (int i = 0; i < c.length;) {
            if(tru[i] == false){
                System.out.println("The given String is not a Pangram");
                break;
            }else{
                System.out.println("The given string is a Pangram.");
                break;
            }
        
        }
        
       
    }
} 