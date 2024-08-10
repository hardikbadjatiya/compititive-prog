
import java.util.Scanner;

public class Code12 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
          long a=sc.nextLong();
          long b=sc.nextLong();
          if(b<=a)
          {
             double d=Math.log10(b)/Math.log10(2);
             if(d-(long)d>0)
             {
                 d=d+1;
             }
              System.out.println((long)d+1);
          }
          else{
                 long days=0;
           
                  double d=Math.log10(a)/Math.log10(2)+1;
             if(d-(long)d>0)
             {
                     d=d+1;
             }
             
            
             long r=b/a;
             days=days+(long)d*r;
            b=b-a;
            long e=b%a;
          
            if(e>0)
          {
             double l=Math.log10(e)/Math.log10(2);
             if(l-(long)l>0)
             {
                 l=l+1;
             }
             days=days+(long)l+1;
              System.out.println((long)days);
          }
            else{
            System.out.println((long)days);
            }
              }
          }    
      
   
}
}
