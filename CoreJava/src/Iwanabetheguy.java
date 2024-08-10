
import java.util.Arrays;
import java.util.Scanner;

public class Iwanabetheguy {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[m];
   for(int i=0;i<m;i++)
   {
       ar[i]=sc.nextInt();
   }
   int q=sc.nextInt();
   int arr[]=new int[q];
   for(int i=0;i<q;i++)
   {
       arr[i]=sc.nextInt();
   }
   sc.close();
   int x=0;
   for(int i=0;i<m;i++)
   {
       for(int j=0;j<q;j++)
       {
           
           if(arr[j]==ar[i])
           {
           ++x;    
           }
       }
   }
   
   if((m+q-x)==n)
   {
       System.out.println("I become the guy.");
   }
   else
   {
       System.out.println("Oh, my keyboard!");
   }
}
    
}
