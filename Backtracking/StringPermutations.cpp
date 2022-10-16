#include<iostream>
using namespace std;



int permutation_s(string s, int left, int right){
    if(left == right){
        cout << s << endl;
        return 0;
    
    }
    for(int i=left;i<=right;i++){
        swap(s[i], s[left]);
        permutation_s(s, left+1, right);
        swap(s[i], s[left]);
    }
    
    return 0;
}

int main() {
    string s;
    cin >>s;
    int right = s.size();
    permutation_s(s, 0, right-1);
    return 0;
}