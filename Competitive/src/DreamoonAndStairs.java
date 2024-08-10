
import java.util.Scanner;

public class DreamoonAndStairs {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int x=n;
   int a=n/2;
   int b=n%2;
   int d=0;
   if(n<m)
   {
       System.out.println("-1");
   }
   else if(n==m)
   {
       System.out.println(n);
   }
   else
   {
   while(x>0)
   {
   for(int i=0;i<n;i++)
   {
       for(int j=n/2;j>=0;j--)
       {
           if(n==(2*j)+i)
           {
               if((i+j)%m==0)
               {
                   d++;
                   System.out.println(i+j);
                   System.exit(0);
               }
           }
       }
   }
   }
   
}}
    
}
