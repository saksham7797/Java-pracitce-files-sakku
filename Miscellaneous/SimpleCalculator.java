import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            while(true){

                System.out.print("Enter the First Number: ");
                int num1 = scan.nextInt();

                System.out.print("Enter the Second Number: ");
                int num2 = scan.nextInt();
                
                System.out.print("Enter the operator: ");
                char oper = scan.next().charAt(0);

                

                switch (oper) {
                    case '+' -> System.out.println(num1 +num2);
                    case '-' -> {
                        if(num1>num2){
                            System.out.println(num1-num2);
                            
                        }else{
                            System.out.println(num2-num1);
                            
                        }
                    }
                    case '*' -> System.out.println(num1*num2);
                    case '/' -> {
                        if(num2 == 0){
                            System.out.println("Cannot Divide by Zero.");
                            
                        }else{
                            System.out.println(num1/num2);
                            
                        }
                    }
                    case '%' -> {
                        if(num2==0){
                            System.out.println("Cannot Divide by Zero.");
                            
                        }else{
                            System.out.println(num1%num2);
                            
                        }
                    }
                    case 'x', 'X' -> System.out.println("You have exited the program.");
                    default -> System.out.println("---------Invalid Input.---------");
                }
            }
        }
            
    }
}


