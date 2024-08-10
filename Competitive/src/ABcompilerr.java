
import java.util.Arrays;
import java.util.Scanner;

public class ABcompilerr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar1[]=new int[n];
   int ar2[]=new int[n-1];
   int ar3[]=new int[n-2];
   int x=0;
   int y=0;
   int z=0;
   for(int i=0;i<n;i++)
   {
       ar1[i]=sc.nextInt();
       x=x+ar1[i];
   }
      for(int i=0;i<n-1;i++)
   {
       ar2[i]=sc.nextInt();
       y=y+ar2[i];
   }  
      for(int i=0;i<n-2;i++)
   {
       ar3[i]=sc.nextInt();
       z=z+ar3[i];
   }
    System.out.println(x-y);
    System.out.println(y-z);
}
       
}
