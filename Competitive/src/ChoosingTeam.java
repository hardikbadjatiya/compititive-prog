
import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeam {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   Arrays.sort(ar);
  int x=0;
   for(int i=0;i<n;i++)
   {
       if((5-ar[i])>=k)
       {
           ++x;
       }
   }
    System.out.println(x/3);
}
    
}
