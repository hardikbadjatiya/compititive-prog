
import java.util.Scanner;

public class Hulk {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   if(n==1)
   {
       System.out.print("I hate it");
       
   }
   else if(n>1)
   {
       
       for(int i=1;i<n;i++)
       {
           
           if(i%2!=0)
           {
               System.out.print("I hate that ");
           }
           
           else{
               System.out.print("I love that ");
           }
       }
       if(n%2!=0)
       {
           System.out.print("I hate it ");
       }
       else{
            System.out.print("I love it ");
       }
   }
}
        
}
