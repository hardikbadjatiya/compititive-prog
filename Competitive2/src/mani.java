
import java.util.Scanner;

public class mani {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
   long p=sc.nextLong();
   int x=0;
  if(n==1||p==1)
  {
      System.out.println("1");
      System.exit(0);
  }
   for(int i=1;i<Math.min(n, p)/2;i++)
   {
       if((Math.max(n, p)*i)%Math.min(n, p)==0)
       {
           x=i;
           break;
       }
   }
   
  long hcf=Math.min(n, p)/x;
  int l=0;
  
  for(int i=1;i<=hcf/2;i++)
  {
     if(hcf%i==0)
     {
         long h=hcf/i;
         if(h>i)
         {
     l=l+2;
     }
         else if(h==i){
     l=l+1;        
         }
       else  if(h<i)
         {
             System.out.println(l);
        System.exit(0);
         }
         
     }
  }
    System.out.println(l);
}
    
}
