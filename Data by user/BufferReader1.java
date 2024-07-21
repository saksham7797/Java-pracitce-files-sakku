import java.io.*;
public class BufferReader1{
    public static void main(String[] args){
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            System.out.println("Enter your Name: ");
            str = buff.readLine();
            System.out.println("User Name: " + str);
        }catch(IOException e){}
    }
}