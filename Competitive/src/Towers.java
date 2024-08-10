
import java.util.Scanner;

public class Towers {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String str=sc.next();
   int x=0;
   for(int i=0;i<n-2;i++)
   {
  if( str.charAt(i)=='x'&&str.charAt(i+1)=='x'&&str.charAt(i+2)=='x')
  {
      ++x;
  }
   }
    System.out.println(x);
}
    
}
