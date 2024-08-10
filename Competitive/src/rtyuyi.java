
import java.util.Scanner;

public class rtyuyi {
public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
          int t=sc.nextInt();
          while(t-->0)
          {
              int n=sc.nextInt();
              int ar[]=new int[n];
              for(int i=0;i<n;i++)
              {
                  ar[i]=sc.nextInt();
              }
              if(ar[0]+ar[1]<=ar[n-1])
              {
                 System.out.println(1+" "+2+" "+(n));
              }
              else
              {
                  System.out.println("-1");
              }
          }
}
    
}
