
import java.util.Scanner;

public class DuffMeat {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       arr[i]=sc.nextInt();
   }
   int min=arr[0];
   int sum=min*ar[0];
   for(int i=1;i<n;i++)
   {
       if(arr[i]<=min)
       {
           min=arr[i];
       }
       sum=sum+min*ar[i];
   }
    System.out.println(sum);
   
}
 
      
}
