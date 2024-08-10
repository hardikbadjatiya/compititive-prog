
import java.util.Scanner;

public class lp {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int o=0;
       int e=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]%2==0)
           {
               ++e;
           }
           if(ar[i]%2==1)
           {
               ++o;
           }
       }
       int x=0;
       if(o>0)
       {
       if(o%2!=0)
       {
           x=1;
       }
       else{
           if(e>0)
           {
               x=1;
           }
           
               }
           }
       if(x==1)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
}
}
    
}
