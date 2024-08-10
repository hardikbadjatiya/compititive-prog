
import java.util.Scanner;

public class Intiialbet {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int ar[]=new int[5];
   int x=0;
   for(int i=0;i<5;i++)
       
   {
       ar[i]=sc.nextInt();
       x=x+ar[i];
   }
   if(x%5==0)
   {
       if(x==0)
       {
           System.out.println("-1");
       }
       else
       System.out.println(x/5);
   }
   else if(x%5!=0){
       System.out.println("-1");
   }
}
    
}
