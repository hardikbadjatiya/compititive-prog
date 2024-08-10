
import java.util.Scanner;

public class Evrmat {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      int r=1;
      int c=2;
       for(int i=1;i<=n;i++)
       {
             String st="";
            
              if(i%2==1)
              {
              for(int j=1;j<=n;j++)
           {
               if(j%2==1)
               {
            st=st+r+" ";
            r=r+2;
           }
               if(j%2==0)
               {
                   st=st+c+" ";
                   c=c+2;
               }
           }
                  System.out.println(st);  
              st="";
              }
               if(i%2==1)
              {
              for(int j=1;j<=n;j++)
           {
               if(j%2==0)
               {
            st=st+r+" ";
            r=r+2;
           }
               if(j%2==1)
               {
                   st=st+c+" ";
                   c=c+2;
               }
           }
           System.out.println(st);
              st="";
              }
       }
   }
}
    
}
