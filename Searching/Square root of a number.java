// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here 
		int i=1;
		while(i*i<=x)
		{
		    i++;
		}
		return i-1;
		
	 }
}
