
import java.util.Scanner;

public class asdasdasd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long k=sc.nextLong();
       if(n<=k&&n>2)
       {
          long h= k/(n-1);
          
          long o= k%(n-1);
          long p=h*n;
          if(o==0)
          {
              System.out.println(p-1);
          }
          
          else{
              System.out.println(o+p);
          }
       } 
       if(n<=k&&n==2)
       {
           System.out.println(2*k-1);
       }
       if(n>k)
       {
           System.out.println(k);
       }
       
   }
}
    
}
