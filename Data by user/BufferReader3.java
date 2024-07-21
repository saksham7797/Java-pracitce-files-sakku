import java.io.*;
public class BufferReader3{
    public static void main(String[] args){
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            System.out.println("Enter Your Name: ");
            s = buff.readLine();
            System.out.println("The Name Entered Was: " + s);                        
        } catch (IOException e) {
        }
        int m;
        try {
            System.out.println("Enter The Number: ");
            m = Integer.parseInt(buff.readLine());
            System.out.println("The Number Entered was: " + m);            
        } catch (IOException e) {
        }
    }   
    
}