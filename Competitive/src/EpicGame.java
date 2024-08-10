
import java.util.Scanner;

public class EpicGame {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int n=sc.nextInt();
   int x=0;
   int y=0;
   int z=0;
   x=n;
       
   while(x>0)
   {
       if(x%a==0&&x>0)
      {
         x=x-a;
         ++y;
      }
       else 
       if(x%a!=0&&x>0)
       {
           x=x-(x/a);
           ++y;
       }
       if(x%b==0&&x>0)
       {
           x=x-b;
           ++z;
       }
       else if(x%b!=0&&x>0)
       {
           x=x-(x/b);
           ++z;
       }
   }
//    System.out.println(x+""+y+""+z);
   if(y>z)
   {
       System.out.println("0");
   }
   else  {
       System.out.println("1");
   }
   
}
    
}
