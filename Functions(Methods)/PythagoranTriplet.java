import java.util.*;
public class PythagoranTriplet {
    public static void main(String[] args) {
        double hypo;
        double base;
        double per;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the length of hypotenuse(The longest one) : ");
            hypo = scan.nextDouble();
            System.out.print("Enter the length of base(Either one could be) : ");
            base = scan.nextDouble();
            System.out.print("Enter the length of perpendicular(Either one could be) :");
            per = scan.nextDouble();
        }

        System.out.println(triplet(hypo,base,per));
    }

    static boolean triplet(double hypo, double base , double per){
        double hehe = base*base + per*per;
        return hehe == hypo*hypo;
    }
}
