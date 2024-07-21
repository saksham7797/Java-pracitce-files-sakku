class Sweet{}
class Rasgulla extends Sweet{}
class Rasmalai extends Sweet{}

public class InstanceOfOperator{
    public static void main(String[] args){
        Sweet gulabjamun = new Rasgulla();
        Sweet mavasweet = new Rasmalai();
        
        if (gulabjamun instanceof Rasgulla){
            System.out.println("gulabjamun in hindi is called Rasgulla");
        }
        if(mavasweet instanceof Rasmalai){
            System.out.println("Rasmalai is made up of mava");
        }
        if (gulabjamun instanceof Sweet){
            System.out.println("Gulabjamun is Sweet");
        }
        if(mavasweet instanceof Sweet){
            System.out.println("Sweets are made out of mava");
        }
        if(gulabjamun instanceof Rasmalai){
            System.out.println("Gulabjamun is not rasmalai");
        }
        if(mavasweet instanceof Rasgulla){
            System.out.println("Rasgulla is made out of panneer not mava");
        }
        
        

    }   
}
