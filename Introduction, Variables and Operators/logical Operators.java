class Geeks{
    
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        boolean x=a && b;
        boolean y=a || b;
        boolean z=(!a) && (!b);
        System.out.print(x+" "+y+" "+z);
    }
}
