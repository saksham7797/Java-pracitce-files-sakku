import java.util.*;
public class ItemsByRule{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------ Some instructions to the user ------------------");
        System.out.println("------------------ At first you have to enter the type of device. ------------------");
        System.out.println("------------------ Then you have to enter the color of the item. ------------------");
        System.out.println("------------------ At last you have to enter the name of the device. ------------------");
        System.out.println();

        String[][] item = new String[3][3];
        
        for (int i = 0; i < item.length; i++) {
            System.out.println("Enter the details for device "  + (i+1) + " " );
            System.out.println();
            System.out.print("Type: ");
            item[i][0] = scan.nextLine();
            System.out.print("Color: ");
            item[i][1] = scan.nextLine();
            System.out.print("Name: ");
            item[i][2] = scan.nextLine();

        }
        System.out.println("Entered details are: ");

        for (int i = 0; i < item.length; i++) {
            System.out.println(Arrays.toString(item[i]));
        }


        System.out.print("Input the rule key: ");
        String rulekey = scan.nextLine().toLowerCase().trim();

        System.out.println();

        System.out.print("Input the value to match: ");
        String rulevalue = scan.nextLine().toLowerCase().trim();

        scan.close();

        
        int temp = 0;
        for (int i = 0; i < item.length; i++) {
            
            switch (rulekey) {
                case "type":
                    if(rulevalue.equals(item[i][0])){
                        temp++;
                    }   break;
                case "color":
                    if(rulevalue.equals(item[i][1])){
                        temp++;
                    }   break;
                case "name":
                    if(rulevalue.equals(item[i][2])){
                        temp++;
                    }   break;
                default:
                    System.out.println("Invalid Input, Please enter the valid Input");
                    break;
            }
        }
            
        System.out.println("The no of matching entries are: " + temp);

        
    }
}