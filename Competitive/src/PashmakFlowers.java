
import java.util.Arrays;
import java.util.Scanner;

public class PashmakFlowers {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   if(n==2)
   {
       System.out.println(ar[1]-ar[0]+" "+1);
   }
   else{
   Arrays.sort(ar);
   int x=ar[n-1]-ar[0];
   int y=0;

   int a=0;
     for(int i=0;i<n;i++)
     {
         if(ar[i]!=ar[0])
         {
             y=i;
             break;
         }
     }
     for(int i=n-1;i>=0;i--)
     {
         if(ar[i]!=ar[n-1])
         {
        a=n-i-1;
        break;
     }}
     
       System.out.println(x+" "+(y*a));
       if(ar[0]==ar[n-1])
			System.out.println("0 "+a*(y-1)/2);
		else
			System.out.println(x+" "+y*a);
  
}
}
}
