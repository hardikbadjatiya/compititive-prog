
import java.util.Scanner;

public class Pointsinsegment {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=new String();
   int m=sc.nextInt();
   String str=new String();
   for(int i=0;i<=m;i++)
   {
       String sa=Integer .toString(i);
       str=str.concat(sa);
   }
   for(int i=0;i<n;i++)
   {
       int l=sc.nextInt();
       int r=sc.nextInt();
       for(int j=l;j<=r;j++)
       {
           String s= Integer.toString(j);
           if(st.contains(s))
           {
           continue;
           }
           else{
               st=st.concat(s);
           }
       }
   }
    int a=str.length()-st.length();
    System.out.println(a);
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)!=st.charAt(i))
        {
            System.out.println(str.charAt(i));
            
        }
    }
}
    
}
