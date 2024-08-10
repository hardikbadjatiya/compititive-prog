
import java.util.Scanner;

public class grhsds {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   if(n==2)
   {
       if(ar[0]==ar[1])
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
   }
   int h=0;
   int j=0;
   if(n==1)
   {
       System.out.println("NO");
   }
   if(n>=3)
   {
       for(int i=0;i<n-2;i++)
       {
           if(ar[i+1]==ar[i]+ar[i+2])
       
           {
               ++h;
           
           }
       }
     
       for(int i=0;i<n-1;i++)
       {
     if(ar[i]>0)
     {
         if(ar[i]==ar[i+1])
         {
             i=i+1;
         }
         else{
           j=1;  
         }
     }
       }
       if(j==0||h==n-2)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
   }
}
    
}
