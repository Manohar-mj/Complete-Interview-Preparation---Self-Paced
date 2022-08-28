import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int operator){

    //write your code here
    switch(operator){
        case 1:System.out.print(a+b);break;
        case 2:System.out.print(a-b);break;
        case 3:System.out.print(a*b);break;
        default:System.out.println("Invalid Input");break;
    }
    
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int operator = scn.nextInt();
            utility(a, b, operator);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
