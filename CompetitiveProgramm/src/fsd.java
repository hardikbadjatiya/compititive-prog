
import java.util.Arrays;
import java.util.Scanner;

public class fsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int ar[]=new int[n];
           int b[]=new int[n];
           int c[]=new int[n];
           for(int i=0;i<n;i++)
           {
             ar[i]=sc.nextInt();
            b[i]=ar[i]; 
           }
           for(int i=0;i<n;i++)
           {
             c[i]=sc.nextInt();
           }
           Arrays.sort(b);
           int u=0;
           for(int i=0;i<n;i++)
           {
               if(ar[i]!=b[i])
               {
           u=1;
           break;
               }
           }
           if(u==1)
           {
               int y=0;
               for(int i=0;i<n-1;i++)
               {
                   if(ar[i]>ar[i+1])
                   {
                       if(c[i]==c[i+1])
                       {
                       y=1;          
                       break;
                       }
                   }
               }
               if(y==1)
               {
                   System.out.println("No");
               }
               else{
                   System.out.println("Yes");
               }
           }
           if(u==0)
           {
               System.out.println("Yes");
           }
       }
}
    
}
