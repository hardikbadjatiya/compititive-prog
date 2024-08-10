import java.util.Arrays;
import java.util.Scanner;

public class NextLevel {
                public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n,k;
   n=sc.nextInt();
   k=sc.nextInt();
   int[] ar = new int[n];
   int x=0;
   for(int i=0;i<n;i++)
   {
       
       ar[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       if(ar[i]>=ar[k-1]&&ar[i]!=0)
       {
           ++x;
       }
   }
                    System.out.println(x);
   
}
}
