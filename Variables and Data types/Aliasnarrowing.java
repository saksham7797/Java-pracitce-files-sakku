public class Aliasnarrowing{
    public static void main(String[] args){
        float a = 1;
        int c = (int)a; //int c= a gives compile error
        System.out.println(a);
        System.out.println(c);


    }
}