
import java.util.Scanner;

public class Bacteria {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for (int i=0;i<n;i++)
   {
       long p=sc.nextLong();
       long q=sc.nextLong();
       long o=sc.nextLong();
       o--;
       long t=(o/p)+o%p*q;
       System.out.println(t+1);
   }
    }
    
}
