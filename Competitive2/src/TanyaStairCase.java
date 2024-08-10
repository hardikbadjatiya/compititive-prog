
import java.util.Scanner;

public class TanyaStairCase {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=0;
   
   for(int i=0;i<n;i++)
   {
   ar[i]=sc.nextInt();
   if(ar[i]==1)
   {
       ++x;
   }
   }
    System.out.println(x);
    int o[]=new int[x];
    int max=1;
    int y=0;
    for(int i=0;i<n-1;i++)
    {
        if(ar[i+1]<=ar[i])
        {
            System.out.print(ar[i]+" ");
        }
        
    }
    System.out.print(ar[n-1]);
}
    
}
