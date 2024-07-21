import java.io.*;
public class BufferReader2{
    public static void main(String[] args){
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int s;
        try {
            System.out.println("Enter the number: ");
            s = Integer.parseInt(buff.readLine());
            System.out.println("The Number is :" + s);

        } catch (IOException e) {
        }
    }
}