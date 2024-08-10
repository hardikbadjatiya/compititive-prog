
import static java.sql.JDBCType.INTEGER;
import java.util.Scanner;

public class orrt {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=sc.nextInt();
   int a[]=new int[n];
   int b[]=new int[n];
   for(int i=0;i<n;i++)
   {
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      
   }
   int e=0;
   int min=x;int max=x;
   while(e==0)
   {e=1;
   for(int i=0;i<n;i++)
   {
       if(a[i]<min&&min<=b[i])
       {
           e=0;
           min=a[i];
       }
       if(b[i]>max&&max>=a[i])
       {
           e=0;
           max=b[i];
       }
       
   }
       
   }
      System.out.println(max-min+1);
    
}
    
}
