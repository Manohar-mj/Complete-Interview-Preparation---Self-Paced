static int distinct(int arr[], int n) {
    // code herent
    int c=0;
    boolean isDistinct=true;
    
    for(int i=0;i<arr.length;i++){
        for( int j=(i-1);j>=0;j--){
            if(arr[i]==arr[j]){
                isDistinct=false;
                break;
            }
        }
        if(isDistinct==true){
            c++;
        }
        isDistinct=true;
    }
    return c;
