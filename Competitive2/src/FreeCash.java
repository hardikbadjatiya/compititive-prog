
import java.util.Scanner;

public class FreeCash {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int br[] =new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       br[i]=sc.nextInt();
       
   }
   int x=1;
   int max=0;
for(int j=0;j<n-1;j++)
   {
   for(int i=0;i<n-1;i++)
   {
              
       if(ar[i]==ar[i+1]&&br[i]==br[i+1])
       {
           ++x;
           
       }
       if(x>max)
       {
           max=x;
           x=1;
       }
       x=0;
   }
    System.out.println(x);
}
    
}
