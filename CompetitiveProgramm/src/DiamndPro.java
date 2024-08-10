
import java.util.Scanner;

public class DiamndPro {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       String stt[]=new String[n];
       for(int i=0;i<n;i++)
       {
           String st="";
           int x=0;
           for(int j=0;j<2*n+1;j++)
           {
               if(j>=n-1-i&&j<=n-1+i)
               {
                 int e=0;  
                  if(x==0&&e==0)
                  {
                   st=st+"1";
                   x=x+1;
                 e=1;
                  }
                  if(x==1&&e==0)
                  {
                      st=st+"0";
                  x--;
                  }
                  
               }
               else{
                   st=st+" ";
               }
           }
           System.out.println(st);
           stt[i]=st;
       }
   for(int i=n-2;i>=0;i--)
   {
       System.out.println(stt[i]);
   }
   }
   

}
}
