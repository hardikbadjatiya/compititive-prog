
import java.util.Arrays;
import java.util.Scanner;

public class Worms {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int y=0;
   for(int i=0;i<n;i++)
   { y=y+sc.nextInt();
      ar[i]=y;
   }
   int m=sc.nextInt();
   for(int i=0;i<m;i++)
   { int x=sc.nextInt();
       second: for(int j=0;j<n;j++)
       {
           if(x<=ar[j])
           {
               System.out.println(j+1);
           break second;
           }
           
           
       }
   }
   
}
    
}
