public static boolean isPalin(String s){
    // code here
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)==s.charAt(s.length()-1-i))
            continue;
        else return false;
    }
    return true;
    
}
