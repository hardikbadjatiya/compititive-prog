
import java.util.Scanner;

public class wewew {
public static void main(String[] args) {

   	 Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int x=sc.nextInt();
       int y=sc.nextInt();
       long l=0;
       if(n==1&&m==1)
       {
           System.out.println(x);
       }
       else{
       if(y>=2*x)
       {
           l=x*(n)*m;
           
       }
       else if(y>=x&&y<2*x){
          int o=n/2;
          int p=n-(n/2);
          int e=m/2;
          int r=m-(m/2);
          int po=x;
          int op=y-x;
//                                           l=p*x*r+(o*(y-x))*e+r*x*o+   (o*(y-x))*o;
         long  ol=((Math.max(po,op)*p)+(Math.min(po,op)*o))*r;
          long ok=(Math.max(po,op)*o+Math.min( po,op)*p)*e;
          
          l=ol+ok;
          
       }
       else if(x>y){
          int o=n/2;
          int p=n-(n/2);
          int e=m/2;
          int r=m-(m/2);
          
//          l=p*x*r+(o*(y-x))*e+r*x*p+   (o*(y-x))*o;
         long  ol=((Math.max(0,y)*p)+(Math.min(0,y)*o))*r;
         long  ok=((Math.max(0,y)*o)+(Math.min(0,y)*p))*e;
         l=ol+ok;  
       }
       System.out.println(l);
   }
   }
}
        
}
