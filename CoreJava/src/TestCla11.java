
import java.util.Scanner;

public class TestCla11 {
        
      
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
      long l=sc.nextLong();
      long r=sc.nextLong();
      long d=sc.nextLong();
      long u=sc.nextLong();
      long x=sc.nextLong();
      long y=sc.nextLong();
      long x1=sc.nextLong();
      long y1=sc.nextLong();
      long x2=sc.nextLong();
      long y2=sc.nextLong();
      if((l>(r+x-x1))||(r>(l+x2-x))||(d>(u+y-y1))||(u>(d+y2-y))||((x1==x&&x2==x)&&(l>0||r>0))||((y1==y&&y2==y)&&(u>0||d>0)))
      {
          System.out.println("NO");
      }
      else{
          System.out.println("YES");
      }
      
       
   }
}
    
}
