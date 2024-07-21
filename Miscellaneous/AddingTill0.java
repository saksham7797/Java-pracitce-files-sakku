import java.util.*;
public class AddingTill0 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            
            
            while(true){
                System.out.print("Enter the Operator: ");//User is asked to enter a operator
                char oper = scan.next().charAt(0);//which is taken as char.
                double num1,num2;
                
                // Switch is used in place of if-else.
                switch(oper){
                    case '+' -> {
                        System.out.print("Enter first number: ");
                        num1 = scan.nextDouble();
                        
                        System.out.print("Enter second number: ");
                        num2 = scan.nextDouble();

                        System.out.println(num1 + num2);
                    }
                    case '-' -> {
                        System.out.print("Enter first number: ");
                        num1 = scan.nextDouble();
                    
                        System.out.print("Enter second number: ");
                        num2 = scan.nextDouble();

                        if(num1>num2){
                            System.out.println(num1-num2);
                        }else{
                            System.out.println(num2-num1);
                        }
                    }
                    case '*' -> {
                        System.out.print("Enter first number: ");
                        num1 = scan.nextDouble();
                    
                        System.out.print("Enter second number: ");
                        num2 = scan.nextDouble();

                        System.out.println(num1*num2);
                    }
                    case '/' -> {
                        System.out.print("Enter first number: ");
                        num1 = scan.nextDouble();
                
                        System.out.print("Enter second number: ");
                        num2 = scan.nextDouble();                
                        
                        if(num1 == 0 || num2==0){
                            System.out.println("The number cannot be divide by zero.");
                        }else{
                            System.out.println(num1/num2);
                        }
                    }
                    case 'x', 'X' -> {break;
                    }
                    default -> {break;
                    }    
                }
            }
        }
    }
}
