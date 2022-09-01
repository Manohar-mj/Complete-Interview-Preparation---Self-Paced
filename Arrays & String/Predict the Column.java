 
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code herent
        int max=0,sum=0,ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j][i] == 0){
                    sum++;
                }
            }
            if(sum>max){
                max=sum;
                ans=i;
            }
            sum=0;
        }
        return ans;
    }
