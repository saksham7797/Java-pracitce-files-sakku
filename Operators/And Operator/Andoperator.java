public class Andoperator{
    public static void main(String[] args){
        int a = 34;
        int b = 56;
        int c = 95;
        System.out.println(a<b && b<c);
        System.out.println(b<a && b<c);
        System.out.println(a<b & b<c);
        System.out.println(a>b & b<c);
        System.out.println(a<b & b>c);
        System.out.println(a>b & b>c);
    }
}