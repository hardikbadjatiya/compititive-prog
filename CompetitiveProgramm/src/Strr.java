
import java.util.Arrays;
import java.util.Scanner;

public class Strr {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       Arrays.sort(ar);
       int x=0;
       for(int i=0;i<n;i++)
       {
           if(ar[i]<=i+1)
           {
              x=i+1;
           }
       }
       System.out.println(x+1);
   }
}
    
}
