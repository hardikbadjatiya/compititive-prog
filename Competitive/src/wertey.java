
import java.util.Scanner;

public class wertey {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       String st[]=new String[n];
       
       for(int i=0;i<n;i++)
       {
       st[i]=sc.next();
       
       }
       
     char s =  st[0].charAt(0);
        int x=0;
        int y=0;
        for(int i=0;i<n-1;i++)
        {
            if(st[i].charAt(m-1)=='R')
            {
                ++x;
            }
        }
        for(int i=0;i<m-1;i++)  
        {
            if(st[n-1].charAt(i)=='D')
            {
                ++x;
            }
        }
       System.out.println(x);
       
   }
   
}
    
}
