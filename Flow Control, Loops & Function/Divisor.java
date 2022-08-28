import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void divisor(int n){
        
    //Write your code here
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.print(i+" ");
        }
    }
        
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            divisor(n);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends
