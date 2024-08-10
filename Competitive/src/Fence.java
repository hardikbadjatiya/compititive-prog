
import java.util.Scanner;

public class Fence {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int h=sc.nextInt();
   int[] ar=new int[n]; 
   int x=0;
   int y=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]<=h)
       {
           x=x+1;
       }
       else
       {
           y=y+2;
       }
   }
    System.out.println(x+y);
}
    
}
