
import java.util.Scanner;

public class Burgers {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {     int x=0;
       int b=sc.nextInt();
       int k=sc.nextInt();
       int f=sc.nextInt();
       int h=sc.nextInt();
       int c=sc.nextInt();
       
       while(b>=2)
       {
       if(h>=c&&k>0)
       {
           x=x+h;
           b=b-2;
           k=k-1;
           if(b<2||(k<1&&f<1))
           {
                    System.out.println(x);
                    break;
           }
       }
       if(h>=c&&k==0&&f>0)
       {
           x=x+c;
           b=b-2;
           f=f-1;
            if(b<2||(k<1&&f<1))
           {
                   System.out.println(x);
                   break;
           }
}
       if(c>h&&f>0)
       {
           x=x+c;
           b=b-2;
           f=f-1;
           if(b<2||(k<1&&f<1))
           {
                   System.out.println(x);
                   break;
           }
       }
       if(c>h&&f==0&&k>0)
       {
           x=x+h;
           b=b-2;
           k=k-1;
           if(b<2||(k<1&&f<1))
           {
                   System.out.println(x);
                   break;
           }
       }
       }
       if(x==0)
       {
           System.out.println(x);
       }
   }
}
    
}
