
import java.util.Arrays;
import java.util.Scanner;

public class jkfdfsjkd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int a[]=new int[n];
       int b[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           
       }
       for(int i=0;i<n;i++)
       {
           b[i]=sc.nextInt();
           
       }
       Arrays.sort(a);
       Arrays.sort(b);
      long w=0;
       for(int i=0;i<n;i++)
       {
           w=w+Math.min(a[i], b[i]);
           
       }
       System.out.println(w);
           }
}
    
}
