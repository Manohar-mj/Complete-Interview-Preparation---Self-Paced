 static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        // int max=Integer.MAX_VALUE;
        int area=0;
        for(int i=0;i<arr.length;i++){
            area=Math.max(area,arr[i].area());
        }
        return area;
    }
