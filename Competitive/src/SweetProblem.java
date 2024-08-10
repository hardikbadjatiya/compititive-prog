
import java.util.Scanner;

public class SweetProblem {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int m=0;
       int med=0;
       int l=0;
       int d=0;
            m=a;
            med=Math.max(b, c);
            l=Math.min(b, c);
       
       if(a>=b&&a>=c)
       {
           
            
            while ((l>=0&&m>=0)||(l>=0&&med>=0)||(med>=0&&m>=0))
            {
                if(l>0&&m>0)
                {l=l-1;
                m=m-1;
               ++d;     
                }
                if(l>0&&med>0)
                {l=l-1;
                m=m-1;
               ++d;     
                }
                if(med>0&&m>0)
                {l=l-1;
                m=m-1;
               ++d;     
                 }    
            }
            System.out.println(d);
           
       }
//       while(a==0||b==0||c=0)
//       if(a>b&&a>c)
//       {
//           int x=Math.max(b, c);
//           int y=Math.min(b, c);
//           if(a>=b+c){
//           System.out.println(b+c);
//          
//           }
//           else
//           {
//           System.out.println(a); 
//           }
//       }
//        if(b>a&&b>c)
//       {
//           int x=Math.max(a, c);
//           int y=Math.min(a, c);
//           if(b>=a+c)
//           {
//           System.out.println(a+c);
//           }
//           else
//           {
//           System.out.println(b); 
//           }
//       }
//        if(c>a&&c>b)
//       {
//           int x=Math.max(a, b);
//           int y=Math.min(a, b);
//           if(c>=b+a){
//           System.out.println(a+b);
//           }
//           else
//           {
//           System.out.println(c);
//           }
//       }
       
   }
}
    
}
