
import java.util.Arrays;
import java.util.Scanner;

public class rtyu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int q=sc.nextInt();
       
       for(int i=0;i<q;i++)
       {
       int x=sc.nextInt();
       
       int y=sc.nextInt();
       
       int e=x+y;
       
       int  p=Arrays.binarySearch(ar, e);
       if(p>=0)
       {
           System.out.println(-1);
       }
       else
       {
           System.out.println(Math.abs(p+1));
       }
       }
   }
    
}
    
}
