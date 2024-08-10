
import java.util.Arrays;
import java.util.Scanner;

public class BusUdailand {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String[] str=new String[n];
   int x=0;
   int y=0;
   for(int i=0;i<n;i++)
   {
       str[i]=sc.next();
   } 
   for(int i=0;i<n;i++)
   {
       if(str[i].toString().contains("OO"))
       {
           x=i;
           y=y+1;
           break;
       } 
   }
   if(y>0)
   {        System.out.println("YES");

       for(int i=0;i<n;i++)
   {
if(i==x)
{
      System.out.println(str[i].toString().replaceFirst("OO","++"));
}
else {
    System.out.println(str[i]);
}
   }
   }
   else {
       System.out.println("NO");
   }
}
}
