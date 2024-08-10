
import java.util.ArrayList;
import java.util.Scanner;

public class ertyu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int k=sc.nextInt();
       ArrayList <Integer> l1=new ArrayList<Integer> ();
       int n=k;
       while(n>1)
      {
       for(int i=2;i<=n;i++)
       {
          if(n%i==0)
          {
             l1.add(i);
             n=n/i;
             break;
          }
       }
      }
       
        
       System.out.println(l1);  
        
   }
}
    
}
