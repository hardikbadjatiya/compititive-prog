
import java.util.Arrays;
import java.util.Scanner;

public class EasyMath {
    public static long product(long x)
    {
        String st=Long.toString(x);
        long u=0;
        for(int i=0;i<st.length();i++)
        {
            String s=Character.toString(st.charAt(i));
            u=u+Integer.parseInt(s);
        }
        
        return u;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       int n=sc.nextInt();
       
       int ar[]=new int[n];
       for(int j=0;j<n;j++)
       {
           ar[j]=sc.nextInt();
       
       }
       long x=0;
       long max=0;
       for(int j=0;j<n-1;j++)
       {
           for(int l=j+1;l<n;l++)
           {
               x=ar[j]*ar[l];
               long o=EasyMath.product(x);
               if(o>max)
               {
                   max=o;
               }
           }
       }
       System.out.println(max);
   }
}
    
}
