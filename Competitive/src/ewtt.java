
import java.util.Scanner;

public class ewtt {
    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in );
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long ar[]=new long[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       int x=0;
      for(int i=0;i<n-1;i++)
      {
          if(ar[i]!=ar[i+1])
          {
              x=1;
              break;
          }
      }
      if(x==1)
        System.out.println("1");
      else
           System.out.println(n);
   }
}
}
