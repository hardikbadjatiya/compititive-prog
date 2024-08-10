
import java.util.Arrays;
import java.util.Scanner;

public class HolidayEquality {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   if(n==1)
   {
       System.out.println("0");
   }
   else{
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
   int x=0;
   for(int i=0;i<n-1;i++)
   {
       x+=ar[n-1]-ar[i];
       
   }
    System.out.println(x);
   
   }
}
    
}
