
import java.util.Scanner;

public class BachGold {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
    System.out.println(n/2);
   for(int i=1;i<n/2;i++)
   {
       System.out.print(2+" ");
   }
   if(n%2==0)
   {
       System.out.print(2);
   }
   else{
       System.out.print(3);
   }
   
}
    
}
