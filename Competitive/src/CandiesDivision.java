
import java.util.Scanner;

public class CandiesDivision {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   for(int i=0;i<t;i++)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int x=0;
       int y=n/k;
       int z=n%k;
       if(n<=k)
       {
           System.out.println(n);
       }
       if(z==0)
       {
           System.out.println(n);
       }
       else{
           if((k/2)*(y+1)+(k-k/2)*y<=n)
           {
               System.out.println((k/2)*(y+1)+(k-k/2)*y);
           }
           
       }
           
       
       
   }
}
    
}
