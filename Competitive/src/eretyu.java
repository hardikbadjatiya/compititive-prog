
import java.util.Arrays;
import java.util.Scanner;

public class eretyu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       String st=sc.next();
       
       int x=0;
       
       ar[0]=st.charAt(0)-48;
       int l=0; 
       if(ar[0]==1)
           ++x;
       
       for(int i=1;i<n;i++)
       {
           
          ar[i]=st.charAt(i)-48;
          if(ar[i]==1)
          {
              ++x;
          }
          ar[i]=ar[i]+ar[i-1];
       if(ar[i]==i+1)
       {
          ++x; 
       }
      
           
       }
       
       for(int i=1;i<n-1;i++)
       {
         for(int j=i+1;j<n;j++) 
         {
            if(ar[j]-ar[i-1]==j-i+1) 
            {
                ++x;
            }
         }
       }
       System.out.println(x);
   }
}
    
}
