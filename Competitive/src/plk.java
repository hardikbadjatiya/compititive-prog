
import java.util.Scanner;

public class plk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       double n=sc.nextDouble();
       double k=sc.nextDouble();
       double o=(double)(n/9);
      
      double p=(double)(k/9);
      if(o-(long)o >0)
      {
          o=o+1;
      }
      if(p-(long)p>0)
      {
          p=p+1;
      }
      int x=(int)o;
      int y=(int)(p);
       if(x==y)
       {
           System.out.println("1 "+x);
       }
       if(x>y)
       {
           System.out.println("1 "+y);
       }
       if(y>x)
       {
           System.out.println("0 "+x);
       }
   }
}
    
}
