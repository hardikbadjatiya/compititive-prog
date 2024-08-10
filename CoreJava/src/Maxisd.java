
import java.util.Scanner;

public class Maxisd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int k=0;k<n;k++)
   {
       int  p=sc.nextInt();
       int  q=sc.nextInt();
       int a=p%10;
       int b=p/10;
       int c=q%10;
       int d=q/10;
       int l=a*10+c+b*10+d;
       int m=d*10+b+c*10+a;
       int lk=p+q;
       int e=0;
       if((b==0&&d==0)&&e==0)
       {e=1;
           System.out.println(p+q);   
       }
       if((p<10&&q>=10)&&e==0)
       {
           e=1;
           System.out.println(Math.max(a*10+d+c,d*10+a+c));
       }
       if((p>=10&&q<10)&&e==0)
       { e=1;
           System.out.println(Math.max(b*10+a+c,c*10+a+b));
       }
       if((lk>=l&&lk>=m)&&e==0)
       { e=1;
           System.out.println(lk);
       }
      if((l>lk&&l>=m)&&e==0)
      { e=1;
          System.out.println(l);
      }
       if((m>lk&&m>l)&&e==0)
       { e=1;
           System.out.println(m);
       }
   }
}
}
