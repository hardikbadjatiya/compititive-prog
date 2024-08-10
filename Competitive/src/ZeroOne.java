
import java.util.Scanner;

public class ZeroOne {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String str=sc.next();
   int z=0;
   int o=0;
   for(int i=0;i<n;i++)
   {
       if(str.charAt(i)=='0')
       {
           z=z+1;
       }
       else {
           o=o+1;
       }
   }
   if(o>z)
   {
       System.out.println(o-z);
   }
   else{
       System.out.println(z-o);
   }
}
    
}
