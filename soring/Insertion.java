class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       while(i>0 && arr[i-1]>arr[i])
       {
           int temp=arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=temp;
           i--;
       }
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++)
      {
          if(arr[i-1]>arr[i])
          {
              insert(arr,i);
          }
      }
  }
}
