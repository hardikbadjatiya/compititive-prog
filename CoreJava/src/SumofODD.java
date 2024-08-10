
import java.util.Scanner;

public class SumofODD {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int x=0;
       int l=(int)Math.sqrt(n);
       if(k<=l)
       {
       if(n%2==0)
       {
           if(k%2==0)
           {
               x=1;
           }
           else{
               x=0;
           }
               }
       if( n%2!=0)
       {
           if(k%2==0)
           {
               x=0;
           }
           else{
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
