
import java.util.Scanner;

public class ererrer {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int e=0;
       for(int i=0;i<n;i++)
       {
          ar[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
       
       if(ar[i]%2==0)
          {
              e=1;
          }
       }
       if(e==0)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
           }
}
    
}
