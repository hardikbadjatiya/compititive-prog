
import java.util.Arrays;
import java.util.Scanner;

public class TestCla12 {
     static int gcd(int a, int b)
 {
     if(a==0)
         return b;
     else
         return gcd(b%a,a);
 }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int arr[]=new int[n];
       int arrr[]=new int[n];
       
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           arrr[i]=0;
       }
       int x=1;
       arr[0]=1;
       System.out.println(gcd(437,779));
       for(int i=0;i<n-1;i++)
       {
           int u=0;
        for(int j=i+1;j<n;j++)
       {
              
           if(gcd(ar[i],ar[j])>1&&arrr[j]==0)
           {
               u=1;
               arr[j]=x;
               arrr[j]=1;
           }
       }
        if(u==0)
        {
            arr[i]=x;
        }
        else
        {
        x++;
   }}
       System.out.println(Arrays.toString(arr));  
}  
}
}
