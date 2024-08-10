
import java.util.Arrays;
import java.util.Scanner;

public class wert {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
     long ar[]=new long[n];
     String st[]=new String[n];
     for(int i=0;i<n;i++)
     {
         ar[i]=sc.nextLong();
            st[i]=Long.toBinaryString   (ar[i]);
            
     }
     long max=0;
     for(int i=0;i<n-1;i++)
     {
         for(int j=i+1;j<n;j++)
         {
            String s=st[i]+""+st[j];
            String r=st[j]+""+st[i];
           long e=Long.parseLong(s,2);
           
           long w=Long.parseLong(r,2);
           
           if(Math.abs(w-e)>max)
           {
               max=Math.abs(w-e);
           }
         }
     }
       System.out.println(max);
   }
}
    
}
