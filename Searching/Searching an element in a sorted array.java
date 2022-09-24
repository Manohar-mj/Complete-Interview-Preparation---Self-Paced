int searchInSorted(int arr[], int N, int K) 
    { 
    
       // Your code here
       for(int i=0;i<N;i++)
       {
           if(arr[i]==K)
           {
            return 1;
            break;
           }
       }
       return -1;
    }
