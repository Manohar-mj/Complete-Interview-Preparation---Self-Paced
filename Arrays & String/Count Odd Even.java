 static void countOddEven(int a[], int n) {

        // Your code herent
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print(odd + " " + even);
        // return odd+" " even;
        
    }
