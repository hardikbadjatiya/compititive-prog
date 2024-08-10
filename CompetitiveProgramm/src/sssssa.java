
import java.util.Arrays;
import java.util.Scanner;

public class sssssa {
    static int[] check(long n)
    {
        int max =0;
        int min=0;
    String st=""+n;
    int ar[]=new int[st.length()];
    for(int i=0;i<=9;i++)
    {
       String s=""+i;
       if(st.contains(s))
       {
           min=i;
break;
       }
       
      }
    for(int i=9;i>=0;i--)
    {
        String s=""+i;
       if(st.contains(s))
       {
           max=i;
break;
       }  
    }
  
       int a[]=new int[2];
        a[0]=max;
        a[1]=min;
      
     return a;
     
    }
    
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      long n=sc.nextLong();
      long k=sc.nextLong();
      int x=0;
      
      for(long i=1;i<=k-1;i++)
      {
          long l=n;
          int ar[]=check(n);
          n=n+ar[0]*ar[1];
          if(l==n)
          {
              break;
          }
      }
       System.out.println(n);
   }
}
}
