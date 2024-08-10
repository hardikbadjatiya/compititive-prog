
import java.util.Scanner;

public class JuneCh2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int y=sc.nextInt();
   while(y-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int f=0;
       int t=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int x=0;
       
       for(int i=0;i<n;i++)
       {
           if(ar[i]==5)
           {
               ++f;
           }
           if(ar[i]==10)
           {
               ++t;
               if(f>0)
               {
                   f--;
               }
               else{
                   x=1;
                   break;
               }
           }
           if(ar[i]==15)
           {
                 if(t>0)
                 {
                     t--;
                 }
                 else{
                     if(f>1)
                     {
                         f=f-2;
                     }
                     else{
                         x=1;
                         break;
                     }
                 }
           }
       }
       if(x==0)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
   }
}
        
}
