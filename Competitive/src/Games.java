
import java.util.Scanner;

public class Games {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       a[i]=sc.nextInt();
       
   }
   int x=0;
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
           if(ar[i]==a[j])
           {
               ++x;
           }
           
           
       }
   }
    System.out.println(x);
}
    
}
