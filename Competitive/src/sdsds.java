
import java.util.Scanner;

public class sdsds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   
   while(t-->0)
   {
        int x=0;
       long n=sc.nextLong();
   int y=0;
       while(n!=1)
      {
          int e=0;
          if(n%6==0)
          {
              n=n/6;
          ++x;
          e=1;
          if(n==1)
          {
              break;
          }
          }
          if(n%3==0&&n%6!=0)
          {
             n=n/3;
             x=x+2;
             e=1;
          if(n==1)
          {
              
              break;
          }
          }
          if(e==0)
          {
              y=1;
           break;   
          }
      }
      if(y==1)
      {
          System.out.println("-1");
      }
      else{
          System.out.println(x);
      }
   }
}
    
}
