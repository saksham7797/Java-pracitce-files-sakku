
// Java Program to implement
// bitwise operators
class GFG {
    // main function
    public static void main(String[] args)
    {
        // Bitwise operators
        int d = 1;
        int e = 2;
        int f = 9;
        System.out.println("d & e: " + (d<e & e>f));
        System.out.println("d | e: " + (d<e | e>f));
        System.out.println("d ^ e: " + (d<e ^ e<f));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}
