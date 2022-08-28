import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends
//User function Template for Java

public static int LCM(int a, int b){

    //write your code here
    //return LCM of a and bnt
    int x=Math.max(a,b);
    int y=a*b;
    int ans=x;
    for(int i=x;i<=y;i++){
        if(i%a==0 & i%b==0){
            ans=i;
            break;
        }
    }
    return ans;
    
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(LCM(a, b));
        }
        scn.close();
    }
}
// } Driver Code Ends
