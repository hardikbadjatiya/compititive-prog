//This is The Coding Area

import java.util.Scanner;

public class lku {
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
    static int mod(int g, int o) 
    { 
        g = g % o; 
        for (int i = 1; i < o; i++) 
           if ((g * i) % o == 1) 
              return i; 
        return 1; 
    } 
 public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int l=sc.nextInt();
   while(l-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int t=sc.nextInt();
       int u=m*t;
       int o=gcd(u,n);
       u=u/o;
       n=n/o;
       int y=mod(n, 1000000007);
       int p=y*u;
       System.out.println(p);
       System.out.println(p%1000000007);

   }
}
    
}
