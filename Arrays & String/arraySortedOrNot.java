    boolean arraySortedOrNot(int[] arr, int n) {
        // code heree
        if (n==1) return true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
