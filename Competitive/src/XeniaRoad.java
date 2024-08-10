
import java.util.Scanner;

public class XeniaRoad {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[m];
   long x=0;
   
   for(int i=0;i<m;i++)
   {
       ar[i]=sc.nextInt();
//       x=x+ar[i]-1;
       
   }
   x=ar[0]-1;
   for(int i=0;i<m-1;i++)
   {
       
       if(ar[i]>ar[i+1])
       {
           x=x+n +ar[i+1]-ar[i];
       }
       if(ar[i]<=ar[i+1])
       {
           x=x+ar[i+1]-ar[i];
       }
   }
    System.out.println(x);
   
   
   
   
   
}
    
}
