
import java.util.Scanner;

public class dsfghsdasf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       
    int ar[]=new int[n];
    int a[]=new int[n];
  
    int sum=0;
    
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
     int sa=0;
     int sb=0;
     int max=0;
     for(int i=0;i<n;i++)
     {
       if(sa==sb)
       {
          if(ar[i]==a[i])
          {
           max=max+ar[i];   
          }
       }
       sa=sa+ar[i];
       sb=sb+a[i];
       
     }
     int asd=sc.nextInt();
     
     int y=Integer.bitCount(asd);
       System.out.println(y);
       System.out.println(max);
    
   }
}
    
}
