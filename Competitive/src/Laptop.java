
import java.util.Arrays;
import java.util.Scanner;

public class Laptop {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
    int    ar1=sc.nextInt();
   int     ar2=sc.nextInt();
   if(ar1!=ar2)
   {
       
       System.out.println("Happy Alex");
       System.exit(0);
   }
   
   }
    System.out.println("Poor Alex");
}
}