
import java.util.ArrayList;
import java.util.Scanner;

public class sdsddsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       int x=sc.nextInt();
       int m=sc.nextInt();
       int max=x;
       int min=x;
       for(int i=0;i<m;i++)
       {
           int l=sc.nextInt();
           int y=sc.nextInt();
            
           if(min>=l&&min<=y)
          {
            min=l;
          }
          if(max>=l&&max<=y)
          {
            max=y;
          }
       }
      
       System.out.println(max-min+1);
   }
}
    
}
