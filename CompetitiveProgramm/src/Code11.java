
import java.util.Scanner;

public class Code11 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       long a[]=new long[n];
       long b[]=new long[n];
       long max=0;
       long s=0;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextLong();
           b[i]=sc.nextLong();
          s=s+a[i];
           long x=a[i]-b[i];
         
       }
       long h=0;
       long min=100000;
       for(int p=1;p<n-1;p++)
       {
            h=a[p];
          for(int i=p;i<n-1;i++)
          {
              if(i<n)
              h=h +Math.max(0, a[i+1]-b[i]);
          }
          h=h+Math.max(0, a[0]-b[n-1]);
          
          for(int i=0;i<p-1;i++)
              {
               h=h+Math.max(0, a[i+1]-b[i]);
              }
      if(h<min)
      {
          min=h;
      }
       }     
       System.out.println(min);
       
      
   }

}
}
