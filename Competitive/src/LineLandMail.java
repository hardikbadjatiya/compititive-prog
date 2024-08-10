
import java.util.Arrays;
import java.util.Scanner;

public class LineLandMail {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   int a[]=new int[n-1];
   int max=0;
   int min=0;
   int min1=0;
   int max1=0;
   max=ar[n-1]-ar[0];
   min=ar[1]-ar[0];
    System.out.println(min+" "+max);
   for(int i=1;i<n-1;i++)
   {
     min=ar[i]-ar[i-1];
     min1=ar[i+1]-ar[i];
     max=ar[i]-ar[0];
     max1=ar[n-1]-ar[i];
       System.out.println(Math.min(min, min1)+" "+Math.max(max,max1));
       
   }
  int d=0;
  d=ar[n-1]-ar[n-2];
  int c=0;
  c=ar[n-1]-ar[0];
    System.out.println(d+" "+c);
}
    
}
