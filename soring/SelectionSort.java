
class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for (int i =0; i < n - 1; i++) {
     
             int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
             int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
	    }
	
    
	}
}
