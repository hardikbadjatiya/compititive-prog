
import java.util.Scanner;

public class NeyYearMin {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=0;
   for(int i=0;i<n;i++)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       x=60-b+(24-a-1)*60;
       System.out.println(x);
   }
}
    
}
