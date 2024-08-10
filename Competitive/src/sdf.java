
import java.util.Arrays;
import java.util.Scanner;

public class sdf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       
        Integer[] ar = new Integer[n];
		    for(int i = 0; i < n; i++) ar[i] = sc.nextInt();
		    Integer[] b = new Integer[k];
		    for(int i = 0; i < k; i++) b[i] = sc.nextInt();
		   
       Arrays.sort(ar);
       Arrays.sort(b);
       long x=0;
       int o=n-1;
       for(int i=0;i<k;i++)
       {
         if(b[i]==1)
         {
             x=x+ar[o];
         }
             x=x+ar[o];
             o=o-1;
         
       }
      int p=0;
      for(int i=k-1;i>=0;i--)
      {
          if(b[i]!=1)
          { 
              x=x+ar[p];
             p=p+b[i]-1;
          }
      }
      
       System.out.println(x);
           
   }
}
    
}
