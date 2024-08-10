
import java.util.Scanner;

public class lkus {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long c=sc.nextLong();
       long o=0;
       long y=0;
       if(a<=c/b)
       {
       o=1;
       if(b*a>c)
       {
          y=b; 
       }
       }
       else{
          if(a*b>c)
          {
          o=-1;
          
          y=b;
          }
          
       }
      if(a<c)
      {
          o=1;
      }
      if(o==0)
      {
          o=-1;
      }
      if(y==0)
      {
          y=-1;
      }
       System.out.println(o+" "+y);
   }
   
}
    
}
