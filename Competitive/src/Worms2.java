
import java.util.Arrays;
import java.util.Scanner;

public class Worms2 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int a[]=new int[n];
   ar[0]=sc.nextInt();
   a[0]=ar[0];
      
   for(int i=1;i<n;i++)
   {
       ar[i]=sc.nextInt();
       a[i]=ar[i]+a[i-1];
       
   }
    
   int m=sc.nextInt();
  for(int i=0;i<m;i++)
   {   
       int x=sc.nextInt();
   for(int j=0;j<n;j++)
   {
       if(x<=a[j])
       {
           System.out.println(j+1);
           break;
       }
   }}
}
    
}
