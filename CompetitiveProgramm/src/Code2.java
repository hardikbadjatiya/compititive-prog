
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Code2 {
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
        
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        long x=0;
        for(int i=n-1;i>=0;i--)
        {
             
            if(ar[i]-(n-1-i)>0)
            {
          x=x+ar[i]-(n-1-i);
           }
          
        }
        System.out.println(x%1000000007);
   }
   
}
}
