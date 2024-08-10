
import java.util.Scanner;

public class Perfectpermutation {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   if(n%2==1)
   {
       System.out.println("-1");
       System.exit(0);
   }
   for(int i=0;i<n;i++)
   {
       ar[i]=n-i;
    System.out.print(ar[i]+" ");
   
   }}
    
}
