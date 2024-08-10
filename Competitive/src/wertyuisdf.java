
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.H;

public class wertyuisdf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[n];
   int a[]=new int[n];
   HashSet <Integer> h=new HashSet<Integer> ();
       
   for(int i=0;i<n;i++)
   {
       
       ar[i]=sc.nextInt();
       
   }
     for(int i=n-1;i>=0;i--)
     {
       h.add(ar[i]);
       a[i]=h.size();
         
     }
   
   for(int i=0;i<m;i++)
   {
       int w=sc.nextInt();
    
       System.out.println(a[w-1]);
   
   }
}
    
}
