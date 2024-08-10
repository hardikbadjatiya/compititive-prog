
import java.util.Scanner;

public class AfreeIcecream {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
  long x=sc.nextLong();
   int y=0;
   for(int i=0;i<n;i++)
   {
       char c=sc.next().charAt(0);
      long a=sc.nextLong();
   if(c=='+')
   {
       x=x+a;
   }
   else if(c=='-'){
       if(x-a<0)
       {
           ++y;
       }
       else{
           x=x-a;
       }
   }
   }
    System.out.println(x+" "+y);
   
}
    
}
