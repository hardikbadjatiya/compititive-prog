
import java.util.Scanner;

public class MakePointone {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   long x=0;
   long ze=0;
   long neg=0;
   for(int i=0;i<n;i++)
   {
       long u=sc.nextLong();
       if(u>0)
       {
           x=x+u-1;
       }
       if(u<0)
       {
           x=x-u-1;
           ++neg;
       }
       if(u==0)
       {
           ++ze;
       }
   }
   if(neg%2==0)
   {
       System.out.println(x+ze);
   }
   if(neg%2!=0&&ze>0)
   {
       System.out.println(x+ze);
   }
   else if(neg%2!=0&&ze==0){
       System.out.println(x+2);
   }
}
    
}
