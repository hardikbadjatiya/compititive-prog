 
import java.util.Arrays;
import java.util.Scanner;

public class RegistrationSystem {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String sr[]=new String[n];
   for(int i=0;i<n;i++)
   {int x=0;
       sr[i]=sc.next();
       for(int j=0;j<i;j++)
       {if(sr[i].equals(sr[j]))
           {
               ++x;
           }
       }
           if(x==0)
           {
               System.out.println("OK");
           }
           else {
           System.out.println(sr[i]+""+x);
       } 
   }
   }
}
