
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class fghjghkjl {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       Long ar[]=new Long[n];
       
       for(int i=0;i<n;i++)
       {
       ar[i]=sc.nextLong();
       }
       Arrays.sort(ar);
        Arrays.sort(ar, Collections.reverseOrder());
 
      long x=0;
      long y=0;
        if(n>=3)
        {
            x=x+ar[0];
            y=y+ar[1]+ar[2];
       for(int i=3;i<n;i++)
       {
           if(i%2==1)
           {
               x=x+ar[i];
           }
           else{
               y=y+ar[i]
;           }
       }
       if(x>y)
       {
           System.out.println("first");
       }
       if(y>x)
       {
           System.out.println("second");
       }
       if(x==y)
       {
           System.out.println("draw");
       }
        }
        if(n<3){
           x=ar[0];
           for(int i=1;i<n;i++)
           {
               y=y+ar[i];
           }
           if(x>y)
       {
           System.out.println("first");
       }
       if(y>x)
       {
           System.out.println("second");
       }
       if(x==y)
       {
           System.out.println("draw");
       }
        }
   }
   
}
    
}
