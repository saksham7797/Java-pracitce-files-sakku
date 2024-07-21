public class ImmutableString{
    public static void main(String[] args){
        String str = "Hello World";
        String str2 = "Hello Java";
       // str.concat(", It is very easy.");// as string is a immutable object, it will not give any output like "Hello World, It is very easy." 
        System.out.println(str);
        System.out.println(str2);


    }
}