
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rttyui {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
     String s=sc.next();
     int n=s.length();
     ArrayList <Integer> l1=new ArrayList<>();
     
     int x=0;
     for(int i=0;i<n;i++)
     {
     if(s.charAt(i)=='1')
     {
         ++x;
     if(i==n-1&&x>0)
     {
         l1.add(x);
     }
     }
     if(s.charAt(i)=='0')
     {
         if(x>0)
         {
         l1.add(x);
         }
         x=0;
         
     }
     }
     Collections.sort(l1);
     int k=0;
     int p=0;
     int l=0;
     for(int i=l1.size()-1;i>=0;i--)
     {
     if(l%2==0)
     {
         k=k+l1.get(i);
   l++;
     }
     else{
         l++;
         p=p+l1.get(i);
     }
     }
       System.out.println(Math.max(k,p));
   }
}
    
}
