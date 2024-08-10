
import java.util.Arrays;
import java.util.Scanner;

public class erwrw {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      long k=sc.nextLong();
       long ar[]=new long[n];
       long max=0;
       int x=0;
      String e=""; 
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextLong();
           e=e+ar[i]+" ";
           if(ar[i]>max)
           {
               max=ar[i];
           }
           if(ar[i]==0)
           {
               x=1;
           }
       }
       String kl="";
       
      long m=0;
      String s="";
      String st="";
       
      for(int i=0;i<n;i++)
       {
          ar[i]=max-ar[i];
          s=s+ar[i]+" ";
          if(m<ar[i])
          {   
          m=ar[i] ;
          }
       }
      
      for(int i=0;i<n;i++)
       {
          ar[i]=m-ar[i];
          kl=kl+ar[i]+" ";
       }
       
       if(k%2==1)
       {
           System.out.println(s);
       }
       else{
            System.out.println(kl);
          }
       }
   
}
    
}
