
import java.util.Scanner;

public class sadfghjklgffd {
    static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while (t-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
     int  o=0;
     for(int j=a;j<=b;j++)
     {
         String y=Integer.toHexString(j);
      int l=y.length();
      int u=0;   
      for(int i=0;i<l;i++)
         {
             if(y.charAt(i)>='0'&&y.charAt(i)<='9')
             {
               u=u+y.charAt(i)-48;
             }
             if(y.charAt(i)>='a'&&y.charAt(i)<='z')
             {
                 u=u+y.charAt(i)-96+9;
             }
          
         }
      if(gcd(j,u)>1)
      {
          ++o;
      }
      
     }
       System.out.println(o);
   }
}
    
}
