
import java.util.Scanner;

public class Presents {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=0;
   int y=0;
   if(n%2==0)
   {
       x=n/2;
       y=n/2;
       
   }
   else
   {
       x=(n/2)+1;
       y=n/2;
   }
       
   int ar[]=new int[x];
   int ar1[]=new int[y];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       ar1[i]=sc.nextInt();
      
   }
   
   
}
    
}
