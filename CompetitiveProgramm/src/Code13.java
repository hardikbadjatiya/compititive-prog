
import java.util.Scanner;

public class Code13 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
        long ar[]=new long[n];
       
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextLong();
            
        }
        int x=0;
        int c=0;
        for(int i=1;i<n;i++)
        {
            
            if(ar[i]-ar[i-1]==1)
            {
               ++c;
               if(i==n-1)
               {
                   x++;
               }
            }
            else{
                if(c>0)
                {
                    ++x;
                    c=0;
                }
            }
        }
        System.out.println(x);
        
       
    }

}    
}
