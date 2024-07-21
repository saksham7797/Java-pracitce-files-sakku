import java.util.Scanner;
public class Scanner1{
    public static void main(String[] args){
        try(Scanner hehe = new Scanner(System.in)){
        String s;
        char gender;
        int age;
        long mobNo;
        double percentage;
        System.out.println("Enter Your Name: ");
        s = hehe.nextLine();
        System.out.println("Enter your Gender: ");
        gender = hehe.next().charAt(0);
        System.out.println("Enter your Age: ");
        age = hehe.nextInt();
        System.out.println("Enter your Mobile Number: ");
        mobNo = hehe.nextLong();
        System.out.println("Enter your percentage: ");
        percentage = hehe.nextDouble();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---- Name = " + s + "----");
        System.out.println("---- Gender = " + gender + "----");
        System.out.println("---- Age = " + age + "----");
        System.out.println("---- Mobile Number = "+ mobNo + "----");
        System.out.println("---- Percentage = " + percentage + "----");
        }
        fun();

    }
    static void fun(){
        System.out.println("Now I know ho to make functions");
    }
}