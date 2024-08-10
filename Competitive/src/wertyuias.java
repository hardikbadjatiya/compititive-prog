
import java.util.Scanner;

public class wertyuias {
  public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int zero=0;
       int one=0;
       int two =0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]%3==0)
           {
               ++zero;
           }
           if(ar[i]%3==1)
           {
               ++one;
           }
           if(ar[i]%3==2)
           {
               ++two;
           }
       }
       if(zero==0)
       {
           if(one==0)
           {
              if(two!=0)
              {
                  System.out.println("Yes");
              }
              else{
                  System.out.println("No");
              }
           }
           else{
               if(two==0)
               System.out.println("Yes");
               else
                   System.out.println("No");
           }
       }
       else
       {
           if(one==0)
           {
               if(two==0)
               {
                   System.out.println("No");
               }
               else
               {
                      System.out.println("Yes");
               }
           }
           if(one >0)
           {
               if(two>0)
               {
                   System.out.println("Yes");
               }
               
           }
           
           else{
               System.out.println(" No");
           }
       }
       
   }
}
    
}
