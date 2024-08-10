
import java.util.Arrays;
import java.util.Scanner;

public class StolenKey {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
   int x=ar[n-1]-ar[0]-n+1;
    System.out.println(x);
}
    
}
