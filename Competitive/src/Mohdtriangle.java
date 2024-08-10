
import java.util.Arrays;
import java.util.Scanner;

public class Mohdtriangle {

   public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   Arrays.sort(ar);
   for(int i=0;i<n-2;i++)
   {
       if(ar[i+2]<ar[i+1]+ar[i])
       {
           if(ar[i+1]<ar[i+2]+ar[i])
           {
               if(ar[i]<ar[i+2]+ar[i+1])
               {
                   System.out.println("YES");
                   System.exit(0);
               }
           }
       }
   }
    System.out.println("NO");
}
    
}
