    int posAverage(int numbers[], int size)
    {
        //code herentr
        int s=0,c=0;
        for(int i=0;i<size;i++){
            if(numbers[i]>=0){
                s+=numbers[i];
                c++;
            
                
            }
        }
        return s/c;
        
    }
