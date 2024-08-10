
import java.util.Scanner;

public class ijij {
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
       int max=0;
       int min=-1000000009;
       long s=0;
       int p=-1;
       int e=-1;
       
       if(ar[0]<0)
       {
           min=ar[0];
           e=1;
       }
       
       if(ar[0]>0)
       {
           max=ar[0];
           p=1;
       }
       
       for(int i=1;i<n;i++)
       {
           if(ar[i]>0)
           {
             if(e==1)
             {
        
               s=s+min;
               e=0;
        min=-1000000009;
       
             }
             if(ar[i]>max)
             {
               max=ar[i];
               
             }
             if(i==n-1)
             {
                 s=s+max;
             }
             p=1;
             
           }
           if(ar[i]<0)
           {
             if(p==1)
             {
               s=s+max;
               p=0;
                max=0;
             }
             if(ar[i]>min)
             {
               min=ar[i];
             }
             if(i==n-1)
             {
                 s=s+min;
             }
             e=1;
             
           }
       }
       if(n==1)
       {
           System.out.println(ar[0]);   
       }
       else
       {
       System.out.println(s);
   }}
       }
    
}
