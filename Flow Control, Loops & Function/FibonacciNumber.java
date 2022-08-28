import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
    int a=1;
    int b=1;
    int c=0;
    for(int i=3;i<=n;i++)
    {
         c=a+b;
        a=b;
        b=c;
    }
    return c;
        
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = fibonacci(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
// } Driver Code Ends
