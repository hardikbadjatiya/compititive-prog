
import java.util.Scanner;

public class dfdffd 
{ static long fact(int n) {
    if (n>1)
        return n*fact(n-1);
    else
        return 1;
}
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int p=n/2;
       int m=n/2;
       int v=n%2;
       long e=0;
       while(v<n)
       {
           if(v==0&&n!=0&&m!=0)
           {
                e=e+fact(n)/(fact(p)*fact(m));
           }
           
           else if(v!=0&&n!=0&&m!=0)
           {
                e=e+fact(n)/(fact(p)*fact(m)*fact(v));
               
           }
           p--;
           m--;
           v=v+2;
          }
       
       System.out.println((e+1)%1000000007);
   }
}
    
}
