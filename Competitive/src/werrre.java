
import java.util.Arrays;
import java.util.Scanner;

public class werrre {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int o[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
       if(ar[i]>=100)
     {
         int a=ar[i]/100;
        int w=ar[i]%100;
        int b=w/10;
        int c=ar[i]%10;
        int p=Math.min(a, Math.min(b,c));
       int q=Math.max(a, Math.max(b,c))
;
       o[i]=((p*7)+(q*11))%100;
     }
       else{
           int a=ar[i]/10;
           int b=ar[i]%10;
           int p=Math.max(a,b);
           int q=Math.min(a, b);
           o[i]=(p*11+q*7)%100;
       
       }
       
   }
   int w[]=new int[10];
   int l[]=new int[10];
   
   for(int i=0;i<n;i++)
   {
      if(i%2==0)
      {
        int y=o[i]/10;
        w[y]++;
        
      }
      else{
        int y=o[i]/10;
        l[y]++;
          
      }
   }
   int r=0;
   for(int i=0;i<10;i++)
   {
       int op=0;
       int po=0;
      if(w[i]==2) ++op;
      
      if(w[i]>2) op=op+2;
      
      if(l[i]==2) ++po;
      
      if(l[i]>2) po=po+2;
      
      
      r=r+Math.min(2, po+op);
   }
    System.out.println(r);
}

    
}
