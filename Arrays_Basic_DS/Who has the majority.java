class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int x_count=0,y_count=0,res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                x_count++;
            }else if(arr[i]==y){
                y_count++;
            }
        }
        if(x_count == y_count){
            res=Math.min(x,y);
            return res;
        }
        if(x_count>y_count)
            return x;
        else
            return y;
        
    }
}
