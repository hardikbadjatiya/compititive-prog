
import java.util.Arrays;
import java.util.Scanner;

public class Magnets {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] ar=new int[n];
   int x=0;
   int y=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
      
   }
   for(int i=0;i<n-1;i++)
   {
       if(ar[i+1]-ar[i]!=0)
       {
           ++x;
       }
   }
    System.out.println(x+1);
}
    
}
