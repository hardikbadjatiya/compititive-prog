
import java.util.Scanner;

public class DistinctDigits {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long a=sc.nextLong();
   long b=sc.nextLong();
   for(long i=a;i<=b;i++)
   {
      String str = Long.toString(i);
      if(str.chars().distinct().count()==str.length())
      {
          System.out.println(i);
          System.exit(0);
      }
      
   }
    System.out.println("-1");
}
    
}
