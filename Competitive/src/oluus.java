
import java.util.Scanner;

public class oluus {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   String a[]=new String[n];
   for(int i=0;i<n;i++)
   {
       a[i]=sc.next();
       
   }
   
   for(int i=0;i<n;i++)
   {
       String s="";
       for(int j=0;j<m;j++)
       {
           int x=0;
         if(i==0)
         {
             if(j==0||j==1)
             {
                 x=1;
                 s=s+0+" ";
             }
         }
         if(i==1&&j==1)
         {x=1;
           s=s+0+" ";  
         }
         if(i==n-1&&j==m-1)
         {x=1;
           s=s+0+" ";  
         }
         if(i==n-1&&j==m-2)
         {x=1;
           s=s+0+" ";  
         }if(i==n-2&&j==m-2)
         {x=1;
           s=s+0+" ";  
         }
         if(x==0)
         {
             s=s+1+" ";
         }
       }
       System.out.println(s);
   }
}
    
}
