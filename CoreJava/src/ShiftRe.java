
import java.util.Arrays;
import java.util.Scanner;

public class ShiftRe {
        static long checkSeq(long ar[], int x)
    {
        int e=0;
        
       for(int i=0;i<x;i++)
       {
           if(ar[i]==i+1)
           {
             ++e;  
           }
       }
        return e;
    }
    static long chckNoPresent(long ar[], int x)
    {int e=0;
       
        long sr[] = ar.clone();
       String st=new String(); 
     for(int i=0;i<x;i++)
       {
           if(ar[i]>x)
           {
               ++e;
           }
           
           else{
               String s=" "+ar[i]+" ";
           if(st.contains(s))
           {
               ++e;
           }
           else{
               st=st+s;
           }
           }
       }
        return e;
    }
    static long[] shift(long ar[], int x)
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
 
   for(int p=0;p<t;p++)
   {
   ar1[p]=sc.nextLong();
   } 
   int n=sc.nextInt();
   long r=0;
   long ep=0;
   
   
   for(int i=0;i<n;i++)
   {
       int x=sc.nextInt();
       long o=sc.nextLong();
       ar1[x-1]=o;
   long ar[]=new long[t];
   ar=ar1.clone();
   
   long qw = checkSeq(ar, t);
   long e=  chckNoPresent(ar, t);
   int l=0;
   long kd=0;
   if(qw+e==t)
      {
      kd=e;
      }
   else{
   for(int j=0;j<t;j++)
   {
   ar=shift(ar, t);
   ++l;
    qw = checkSeq(ar, t);
      
    if(qw+e==t)
      {
      kd=e+l;
      break;
      }
   }
   }
     System.out.println(kd);
   }
    }    
}
