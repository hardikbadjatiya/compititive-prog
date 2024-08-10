
import java.util.Scanner;

public class Suits {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   int s=sc.nextInt();
   int v=sc.nextInt();
   int j=sc.nextInt();
   int a=sc.nextInt();
   int b=sc.nextInt();
   int x=0;
   while(j>=1)
   {
       if(a>=b&&t>0)
       {
           x=x+a;
           t=t-1;
           j=j-1;
       
           if(j<1||(t<1&&(v<1||s<1)))
           {
                    System.out.println(x);
                    break;
           }
       }
       
       if(a>=b&&t==0&&(s>0&&v>0))
       {
           x=x+b;
           j=j-1;
           s=s-1;
           v=v-1;
           if(j<1||(t<1&&(v<1||s<1)))
           {
                   System.out.println(x);
                   break;
           }
        }
       
       if(a<b&&s>0&&v>0)
       {
           x=x+b;
           s=s-1;
           v=v-1;
           j=j-1;
           if(j<1||(t<1&&(v<1||s<1)))
           {
                    System.out.println(x);
                    break;
           }
       }
       if(a<b&&(s==0||v==0)&&(t>0))
       {
           x=x+a;
           j=j-1;
           t=t-1;
           if(j<1||(t<1&&(v<1||s<1)))
           {
                   System.out.println(x);
                   break;
           }
        }
       
       
   }
   
}
    
}
