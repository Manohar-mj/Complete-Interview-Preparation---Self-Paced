public static char extraChar(String s1, String s2){

   //write your code here
    int l1=s1.length();
    int l2=s2.length();
   
   char ch='0';
   int count;

   for(int i=0;i<l2;i++)
   {
       count=0;
       for(int j=0;j<l1;j++)
       {
           if(s2.charAt(i)==s1.charAt(j)){
           count++;
           }
       }
       if(count==0)
       {
            ch=s2.charAt(i);
       }
   }
   return ch;


  
}
