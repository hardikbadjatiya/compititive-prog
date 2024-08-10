
import java.util.Scanner;

public class FedorNewGame {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int k=sc.nextInt();
   int ar[]=new int[m+1];
   int a[]=new int[m];
   int y=0;
   for(int i=0;i<=m;i++)
   {
       ar[i]=sc.nextInt();
   }
   for(int i=0;i<m;i++)
   {
      if(Integer.bitCount(ar[i]^ar[m])<=k)
      {
          ++y;
      }
   }
    System.out.println(y);
}
    
}
