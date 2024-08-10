
import java.util.Arrays;
import java.util.Scanner;

public class dsdsds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long min=10000000;
            long max=0;
            long ar[]=new long[n];

            for(int i=0;i<n;i++)
            {
               ar[i]=sc.nextLong();
            }
          
            for(int i=0;i<n-k+1;i++)
            {
            long y=ar[i];
            long m=ar[i];
                for(int j=i+1;j<k+i;j++)
                {
                  y=y^ar[j];
                }
                
                if(y<min)
                {
                    min=y;
                    
                    if(max<m)
                    {
                        max=m;
                    }
                }
            }
            System.out.println(max);

        }
        
}
    
}
