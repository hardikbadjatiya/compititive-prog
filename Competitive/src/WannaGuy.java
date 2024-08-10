
import java.util.Scanner;

public class WannaGuy {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int p=sc.nextInt();
  
   int ar[]=new int[n+1];
   int z=0;
   int x=0;
   int c=1;
   for(int i=0;i<p;i++)
   {
       ar[sc.nextInt()]=1;
      
       
   }
   int q=sc.nextInt();
   
   
   for(int i=0;i<q;i++)
   {
       ar[sc.nextInt()]=1;
      
   }
   for(int i=1;i<=n;i++)
   {
     if(ar[i]!=1){
         System.out.print("Oh, my keyboard!");
				
     return;
         
     }
   }
   
       System.out.print("I become the guy.");
   
   
   
   
}
    
}
