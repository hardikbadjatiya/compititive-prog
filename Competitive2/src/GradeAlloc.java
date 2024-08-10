
import java.util.Scanner;

public class GradeAlloc {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int ar[]=new int[n];
       int s=0;
       
       ar[0]=sc.nextInt();
       
       if(n==1)
       {
           System.out.println(ar[0]);
       }
       for(int j=1;j<n;j++)
       {
           ar[i]=sc.nextInt();
           s=s+ar[i];
       if(s+ar[0]>=m)
       {
           System.out.println(m);
           break;
       }
       
           
       }
       
       if(s+ar[0]<m){
           System.out.println(s+ar[0]);
       }
       
   }
}
        
}
