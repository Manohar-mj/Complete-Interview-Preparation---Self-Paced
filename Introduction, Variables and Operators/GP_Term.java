import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    
		    Solution  obj=new Solution ();
		    int A,B;
		    
		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        // int N=A+B;
        return (A*Math.pow((double)B/A,N-1));
    }

}
