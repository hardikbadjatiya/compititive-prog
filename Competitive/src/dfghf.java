
import java.util.Scanner;

public class dfghf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String stttt=sc.next();
   
   int a1=0;
   int b1=0;
   int p=0;
   int q=0;
 
   for(int i=0;i<n;i++)
   {
       char ab=stttt.charAt(i);
       if(ab=='-')  ++p;
       
    else if(ab=='A') 
       {
          int u=p/2; 
          int o=0;
          int l=p;
          
          if(q!=0)
          {
             o=1;
             b1=b1+u; 
             a1=a1+u;
             
          }
          q=0;
          if(o==0)
            a1=a1+l; 
          
         p=0;
         a1++;
        }
      else if(ab=='B')
       {
           if(q==1)
           {
            b1=b1+p;
            q=1;
           p=0;
           }
            q=1;
           p=0;
          
           b1=b1+1;
       }
       if(i==n-1)
       {
           if(q==1&&p>0)
           {
               b1=b1+p;
           }
       }
   }
   if(a1>=b1)
   {
       if(a1>b1)
       {
           System.out.println("A");
       }
       else{
           System.out.println("Coalition government");
       }
   }
   else{
       System.out.println("B");
   }
   
}
    
}
