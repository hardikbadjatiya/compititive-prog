
import java.util.Scanner;

public class tytutyr {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   long ar[]=new long[n+1];
   for(int i=1;i<=n;i++)
   {
      ar[i]=sc.nextLong();
   }
   long x=1;
   for(int i=1;i<=(n)/2;i++)
   {
       x=x*ar[i];
   }
   
   long y=x;
  for(int i=1;i<=(n)/2;i++)
  {
      x=x/ar[i];
      x=x*ar[i+n/2];
      y=y+x;
      
  }
    System.out.println(y);
}
    
}
