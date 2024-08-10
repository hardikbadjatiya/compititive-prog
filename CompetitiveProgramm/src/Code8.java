
import java.util.Scanner;

public class Code8 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       long a=sc.nextLong();
       long b=sc.nextLong();
       
       for(int i=0;i<n-1;i++)
      {
         long ar=sc.nextLong();
          long arr=sc.nextLong();
         long  j=(a*ar)-(b*arr);
         long l=(a*arr)+(b*ar);
         a=j;
         b=l;
      }
       System.out.println(a+" "+b);
   }
   
}
    
}
