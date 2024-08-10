
import java.util.Arrays;
import java.util.Scanner;

public class ShiftReplace {
    static long arra(long ar[], int x)
    {int e=0;
        
       for(int i=0;i<x;i++)
       {
          
           if(ar[i]==i+1)
           {
             ++e;  
           }
       }
        return e;
    }
    static long ara(long ar[], int x)
    {int e=0;
        
       for(int i=0;i<x-1;i++)
       {
          for(int j=i+1;j<x;j++)
          {
           if(ar[i]!=i+1)
           {
             ++e;  
           }
       }}
        return e;
    }
    static long[] arasd(long ar[], int x)
    {
        long w=ar[0];
          for(int j=0;j<x-1;j++)
          {
           ar[j]=ar[j+1];
            }
          ar[x-1]=w;
          
        return ar;
    }
    public static void main(String[] args) {
        
    
 Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
 long ar1[]=new long[t];
 long arr[]=new long[t];
 
   for(int p=0;p<t;p++)
   {
   ar1[p]=sc.nextLong();
   arr[p]=p+1;
   }    
   int n=sc.nextInt();
   long r=0;
   long ep=0;
   for(int i=0;i<n;i++)
   {
      int x=sc.nextInt();
      long o=sc.nextLong();
      ar1[x-1]=o;
      long we=0;
     long ar[]=new long[t];
    for(int j=0;j<t;j++)
    {
       ar[j]=ar1[j];
    }
      
    for(int j=0;j<t;j++)
    {
    int uy=0;
   
    r= ShiftReplace.arra(ar,t);
    ep=ShiftReplace.ara(ar, t);
    if(r==t&&uy!=1)
    {
    uy=1;
    
    }
    if(r+ep==t&&uy!=1){
    uy=1;
    we=we+ep;
    }
    
    else if(r+ep<t&&uy!=1){
    ar=ShiftReplace.arasd(ar, t);
    ++we;
    }
     
    if(uy==1)
    {
        System.out.println(we); 
        we=0;
    }
    }
   }
}
}