
import java.util.Scanner;

public class EasyProb {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==1)
       {
           ++x;
       }
   }
   if(x==0)
   {
       System.out.println("EASY");
   }
   else{
       System.out.println("HARD");
   }
   
}
}
