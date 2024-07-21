public class Andoperator2{
    public static void main(String[] args){
        int a = 24, b = 47, c = 96;
        System.out.println(a<b && b++<c);
        System.out.println(a); 
        System.out.println(a<b & c++<b);
        System.out.println(a);
    }
}