
import java.util.Scanner;

public class Tprime2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long x=sc.nextLong();
      if(x==4)
      {
          System.out.println("YES");
      }
      else if(x==1)
      {
          System.out.println("NO");
      }
      else  if(x==5)
      {
          System.out.println("NO");
      }
      else 
      {
             
       double b= Math.sqrt(x);
       int c= (int) b;
       if((b-c)==0)
       {
           int a=0;
        for(int j=2;j<b;j++)
        {
            
            if((b%j)==0)
            {
                a=5;
                System.out.println("NO");
                break;
            }
        }
         if(a!=5)
       {
           System.out.println("YES");
           
       }
         
       }
       else{
           System.out.println("NO");
       }
   }
}
    
}}
