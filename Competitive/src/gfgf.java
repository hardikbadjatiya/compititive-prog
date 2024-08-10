
import java.util.Arrays;
import java.util.Scanner;

public class gfgf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       
       int x=0;
       for(int i=0;i<n;i++)
       {
       if(i%2==0)
       {
        if(ar[i]>0)
        {
            ar[i]=-ar[i];
        }
       }
       else{
          if(ar[i]<0)
              ar[i]=-ar[i];
       }
       }
       String s="";
       for(int i=0;i<n;i++)
       {
           s=s+ar[i]+" ";
       }
       System.out.println(s);
   }
}
    
}
