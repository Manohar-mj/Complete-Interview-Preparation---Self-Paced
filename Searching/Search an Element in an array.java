int search(int arr[], int N, int X)
    {
        
        // Your code herer
        for(int i=0;i<N;i++)
        {
            if(arr[i]==X)
                return i;
        }
        
        return -1;
    }
