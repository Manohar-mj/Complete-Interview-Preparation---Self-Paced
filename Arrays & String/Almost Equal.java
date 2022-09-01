    static int coutChars(String s1, String s2)
    {
        
       //Your code herent
       int ans=0;
       int a[]=new int[26];
       for(int i=0;i< s1.length();i++) 
       a[s1.charAt(i)-'a']++;
       
       for(int i=0;i<s2.length();i++)
       a[s2.charAt(i)-'a']--;
       
       for(int i=0;i<26;i++)
       ans+=Math.abs(a[i]);
       
       return ans;
    //   s3=s.a2.delete(s1);
    //   System.out.println(s3.length());
    }
