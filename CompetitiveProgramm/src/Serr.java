
import java.util.Arrays;
import java.util.Scanner;

public class Serr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
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
    if(ar[i]%ar[0]!=0)
    {
        x=1;
        break;
    }
   }
   if(x==0)
   {
       System.out.println(ar[0]);
   }
   else{
       System.out.println(-1);
   }
}
        
}
