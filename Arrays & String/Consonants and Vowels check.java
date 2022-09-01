    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        char x;
        for(int i=0;i<s.length();i++){
            x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                v++;
            }
            else if(x==' '){
                continue;
            }
            else{
                c++;
            }
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
        System.out.print("Same");
        
        System.out.println();
    }
