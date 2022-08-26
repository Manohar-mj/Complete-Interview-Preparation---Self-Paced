void utility(int d, int n){
    
    //write your code here
    int ans=d-n%7;
    if (ans<0){
        ans=ans*-1;
        ans++;
    }
    cout<<ans;
}
