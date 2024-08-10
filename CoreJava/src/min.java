
import java.util.Scanner;

public class min {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
      if(n==1)
      {
          int x=sc.nextInt();
          System.out.println(x);
      }
       if(n>1&&n<100)
      {
             long min=10000;
       long ar[]=new long[n];
       String st[]=new String[n];
           ar[0]=sc.nextLong();
          long r=0;
          
           for(int i=1;i<n;i++)
       {
           
           ar[i]=sc.nextLong();
       }
           for(int i=0;i<n-1;i++)
       {
       for(int j=i+1;j<n;j++)
       {
           r=(ar[i]&ar[j])^(ar[i]|ar[j]);
           if(r<min)
           {
               min=r;
               if(min==1)
               {
                   break;
               }
           }
       }
       }   System.out.println(min);
      }
       if(n>100)
       {
           int l[]=new int[n];
       long ar[]=new long[n];
       String st[]=new String[n];
           ar[0]=sc.nextLong();
           st[0]=Long.toBinaryString(ar[0]);
       l[0]=st[0].length();
      long min=10000;
      long mi=1000;
      long r=0;
       for(int i=1;i<n;i++)
       {
           ar[i]=sc.nextLong();
         
           st[i]=Long.toBinaryString(ar[i]);
       l[i]=st[i].length();
          if(l[i]==l[i-1])
       {
            
           r=(ar[i]&ar[i-1])^(ar[i]|ar[i-1]);
           if(r<min)
           {
               min=r;
               if(min==1)
               {
                   break;
               }
           }
       }
       }
       System.out.println(min);
     
      }
       
}
}
}
