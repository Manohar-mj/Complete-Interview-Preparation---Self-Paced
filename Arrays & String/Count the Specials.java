 static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int c=0; //count
        //int r=0; //repeat
        for(int i=0;i<n;i++){
            int r=0; 
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    r++;
                }
            }
            if(r==f)//  int f = (int)Math.floor(n/k);
            {
                c++;
            }
        }
        
        System.out.println(c/f);
    }
