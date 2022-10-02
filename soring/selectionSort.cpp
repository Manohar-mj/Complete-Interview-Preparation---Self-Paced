{
    public:
    
     
    void selectionSort(int arr[], int n)
    {
       //code here
       for(int step=0; step < n-1; step++){
           int min = step;
           for(int i=step+1; i < n; i++){
               if(arr[i]<arr[min])
                 min = i;
           }
           swap(arr[min],arr[step]);
           
       }
       
    }
};
