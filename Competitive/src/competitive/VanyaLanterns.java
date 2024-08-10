package competitive;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class VanyaLanterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            
        }
        Arrays.sort(ar);
        int x[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
         x[i]=ar[i+1]-ar[i];   
        }
        Arrays.sort(x);
        NumberFormat nf=NumberFormat.getInstance();
   nf.setMinimumFractionDigits(10);
   float   c=(float) (x[n-1]/2.0) ;
   if(ar[0]==0)
        {
        if(c>ar[0])
        {
            System.out.println(nf.format(c));
        }
        }
        else
        { if(c>ar[0])
        {
            
            System.out.println(nf.format(c));
        }
        else 
            
        {
            
            System.out.println(nf.format(ar[0]));
        }
            
        }
    }
    
}
