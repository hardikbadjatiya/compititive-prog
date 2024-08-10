
import java.util.Scanner;

public class CDas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   long ar[]=new long[n];
   long arr[]=new long[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextLong();
       
   }
   for(int i=0;i<m;i++)
   {
       arr[i]=sc.nextLong();
       
   }
   int q=sc.nextInt();
   int a[]=new int[q];
   int b[]=new int[q];
   
           for(int i=0;i<q;i++)
   {
   a[i]=sc.nextInt();
   b[i]=sc.nextInt();
   long x=0;
   String s=" ";
   long sum=0;
    for(int j=a[i]-1;j<b[i];j++)
    {
        sum=sum+j;
    String qw=" "+ar[j]+" ";
        if(s.contains(qw)!=true)
        {
            x=x+ar[j]*ar[j];
            qw=qw+" "+ar[j]+" ";
            
        }
      }
       System.out.println(x+" "+sum);
    if(sum==x)
    { 
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
   }
}
}
