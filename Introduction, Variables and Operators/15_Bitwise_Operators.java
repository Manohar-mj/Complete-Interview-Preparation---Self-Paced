// User function Template for Java

// Function to perform bitwise manipulations
// a, b and c are input integers
class Geeks {
    static void bitWiseOp(int a, int b, int c) {

        // Your code herein
        int d=a^a;
        int e=c^b;
        int f=a&b;
        int g=c | (a^a);
        // int e=~e;
        System.out.println(d);
        // System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(~e);
        
    }
}
