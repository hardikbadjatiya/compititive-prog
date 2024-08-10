
import java.util.Arrays;
import java.util.Scanner;

public class Twins {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=0;
   n=sc.nextInt();
   int ar[]=new int[n];
   int sum=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       sum=sum+ar[i];
       
   }
   int half=(sum/2)+1;
//    System.out.println(sum);
   Arrays.sort(ar);
   int x=0;
   int coin=0;
   for(int i=n-1;i>=0;i--)
   {
       x=x+ar[i];
       coin++;
       if(x>=half)
       {
           System.out.println(coin);
           break;
       }
   }
}
    
}
