
import java.util.Scanner;

public class Asasa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      long n=sc.nextInt();
      int k=sc.nextInt();
       if(n%2==0&&k%2!=0)
       {
           if(k>n/2)
           {
               System.out.println("NO");
           }
           else {
               System.out.println("YES");
            
               for(int i=0;i<k-1;i++)
               {
                   System.out.print("2 ");    
               }
               System.out.print(n-(2*(k-1)));
               System.out.println("");
           }
      }
       if(n%2==0&&k%2==0)
       {
           if(k>n)
           {
               System.out.println("NO");
           }
           else{
               System.out.println("YES");
               for(int i=0;i<k-1;i++)
               {
                   System.out.print("1 ");
               }
               System.out.print(n-(k-1)); 
               System.out.println();
           }
       }
       if(n%2!=0&&k%2==0)
       {
               System.out.println("NO");
        }
             if(n%2!=0&&k%2!=0)
             {
           if(k>n)
           {
               System.out.println("NO");
           }
           else{
               System.out.println("YES");
               for(int i=0;i<k-1;i++)
               {
                   System.out.print("1 ");
               }
               System.out.print(n-(k-1)); 
               System.out.println();
           }
                
             }
   }
}
}
